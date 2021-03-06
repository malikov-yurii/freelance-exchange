package com.malikov.freelance.web.client;

import com.malikov.freelance.model.Client;
import com.malikov.freelance.service.ClientService;
import com.malikov.freelance.to.ClientUserTo;
import com.malikov.freelance.util.BaseUserUtil;
import com.malikov.freelance.util.ClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractClientController {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractClientController.class);

    @Autowired
    ClientService clientService;

    public List<ClientUserTo> getAll() {
        return clientService.getAll().stream().map(ClientUtil::asTo).collect(Collectors.toList());
    }

    public void blockUnblock(int clientId, boolean isBlocked) {
        Client client = clientService.get(clientId);
        client.setBlocked(isBlocked);
        clientService.save(client);
    }

    public void delete(int clientId) {
        clientService.delete(clientId);
    }

    public void create(ClientUserTo clientTo) {
        clientService.save(ClientUtil.newFromTo(clientTo));
    }

    public void update(ClientUserTo clientTo) {
        Client client = clientService.get(clientTo.getId());
        BaseUserUtil.updateFromTo(client, clientTo);
        clientService.save(client);
    }

}