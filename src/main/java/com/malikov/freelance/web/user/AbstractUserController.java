package com.malikov.freelance.web.user;

public abstract class AbstractUserController {
//    protected final Logger log = LoggerFactory.getLogger(getClass());
//
//    private boolean systemUserForbiddenModification;
//
//    @Autowired
//    public void setEnvironment(Environment environment) {
//        systemUserForbiddenModification = Arrays.asList(environment.getActiveProfiles()).contains(Profiles.HEROKU);
//    }
//
//    public void checkModificationAllowed(Integer id) {
//        if (systemUserForbiddenModification && id < 3) {
//            throw new ValidationException("Admin/User modification is not allowed. <br><br><a class=\"btn btn-primary btn-lg\" role=\"button\" href=\"register\">Register &raquo;</a> your own please.");
//        }
//    }
//
//    @Autowired
//    private UserService service;
//
//    public List<User> getAll() {
//        log.info("getAll");
//        return service.getAll();
//    }
//
//    public User get(int id) {
//        log.info("get " + id);
//        return service.get(id);
//    }
//
//    public User create(User user) {
//        user.setId(null);
//        log.info("create " + user);
//        return service.save(user);
//    }
//
//    public void delete(int id) {
//        log.info("delete " + id);
//        service.delete(id);
//    }
//
//    public void update(User user, int id) {
//        user.setId(id);
//        log.info("update " + user);
//        service.update(user);
//    }
//
//    public void update(UserTo userTo) {
//        log.info("update " + userTo);
//        service.update(userTo);
//    }
//
//    public User getLogin(String login) {
//        log.info("getByEmail " + login);
//        return service.getByLogin(login);
//    }
//
//    // TODO: 1/16/2017 Consider necessity of enableUnlimited/disable user feature
////    public void enableUnlimited(int id, boolean enabled) {
////        log.info((enabled ? "enableUnlimited " : "disable ") + id);
////        service.enableUnlimited(id, enabled);
////    }
}
