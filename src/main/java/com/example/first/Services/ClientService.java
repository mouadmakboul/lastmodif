package com.example.first.Services;

import com.example.first.Entities.ClientEntity;
import com.example.first.Repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class ClientService {
    // welcome this is my first commit
    //youssef now add a new branch in your local then push it to our master
    //we will   add a comment
    //444444
    @Autowired
    private ClientRepo clientre;
    public ClientEntity getClient(Integer ID){
        Optional<ClientEntity> client =this.clientre.findById(ID);
        if(client.isPresent())
            return client.get();
        return null;

    }
    public ClientEntity save(ClientEntity client){
        ClientEntity cli =this.clientre.save(client);
        return cli;
    }
    public ClientEntity saveClients(ClientEntity clients) {
        ClientEntity cli =this.clientre.save(clients);
        return cli;
    }
    public void deleteclient(Integer id) {
        clientre.deleteById(id);
    }
    public ClientEntity update(ClientEntity client) {
        if (clientre.findById(client.getIdclient()).isPresent()) {
            return clientre.save(client);
        }
        return null;
    }}
