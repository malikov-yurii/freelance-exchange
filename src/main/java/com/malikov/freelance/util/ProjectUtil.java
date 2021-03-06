package com.malikov.freelance.util;

import com.malikov.freelance.model.*;
import com.malikov.freelance.to.ProjectSmallTo;
import com.malikov.freelance.to.ProjectTo;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ProjectUtil {

    public static ProjectSmallTo asSmallTo(Project project){
        return new ProjectSmallTo(project.getName()
                , project.getDescription()
                , project.getClient().getLastName()
                , SkillUtil.skillCollectionToString(project.getRequiredSkills()));
    }

    public static ProjectTo asTo(Project project, ApplicationStatus applicationStatus, User authorizedUser) {
        return new ProjectTo(project.getId(), project.getClient().getId(), project.getName(),
                project.getDescription(), project.getPayment(), project.getClientLastName(),
                project.getStatus(), SkillUtil.skillCollectionToString(project.getRequiredSkills()), applicationStatus,
                authorizedUser.getRoles().contains(Role.ROLE_ADMIN) ||
                        (authorizedUser.getRoles().contains(Role.ROLE_CLIENT)
                                        && Objects.equals(authorizedUser.getId(), project.getClient().getId()))
                        ? project.getAppliedFreelancers()
                        : Collections.emptyList()
                , authorizedUser.getRoles().contains(Role.ROLE_ADMIN)
                    ? project.getComments()
                    : project.getComments().stream().filter(comment -> !comment.getBlocked()).collect(Collectors.toList())
        , project.getBlocked());
    }

    public static Project newFromTo(ProjectTo projectTo, Client client, Set<Skill> skills) {
        return new Project(
                null
                , projectTo.getName() == null ? "No name provided" : projectTo.getName()
                , ProjectStatus.LOOKING_FOR_FREELANCER
                , projectTo.getDescription() == null ? "No description provided" : projectTo.getDescription()
                , projectTo.getPayment() == null ? new BigDecimal(0) : projectTo.getPayment()
                , client
                , null
                , null
                , skills
                , null
        );
    }

}
