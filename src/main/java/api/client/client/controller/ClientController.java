package api.client.client.controller;

import java.util.*;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import api.client.client.model.Client;
import api.client.client.repository.ClientRepository;

@RestController
public class ClientController {

    @Autowired
    private ClientRepository clientRepo;

    @GetMapping(value= "/user")
    public List<Client> clientList() {
        return Lists.newArrayList(clientRepo.findAll());
    }

    @GetMapping(value= "/user/{id}")
    public Optional<Client> findById(@PathVariable int id) {
        return clientRepo.findById(id);
    }

    @PostMapping(value= "/user/userName={userName}")
    public Client findByUserName(@PathVariable String userName) {
        System.out.println(userName);
        System.out.println(clientRepo.findByUserName(userName));
        return clientRepo.findByUserName(userName);
    }

    @PostMapping(value= "/user")
    public Client addClient(@RequestBody Client client) {
        return clientRepo.save(client);
    }

    @PutMapping(value= "/user/{id}")
    public Client update(@PathVariable int id, @RequestBody Client client) {
        client.setId(id);
        clientRepo.save(client);
        return client;
    }

    @DeleteMapping(value = "/user/{id}")
    public void remove(@PathVariable int id) {
        clientRepo.deleteById(id);
    }
}

