package com.reto.reto3.controllers;

import com.reto.reto3.dto.Client;
import com.reto.reto3.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(path = "/api/Client")
public class ClientController {
    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(path = "/all")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @PostMapping(path = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveClient(@RequestBody Client client){
        clientService.saveClient(client);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteClient(@PathVariable Integer id){
        return clientService.deleteById(id);
    }

    @PutMapping(path = "/update")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean updateClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }
}
