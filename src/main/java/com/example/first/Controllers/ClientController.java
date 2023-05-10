package com.example.first.Controllers;

import ch.qos.logback.core.model.Model;
import com.example.first.Entities.ClientEntity;
import com.example.first.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService cs;
    @GetMapping("/getclient")
    public ClientEntity getclient(@RequestParam Integer id){
        return cs.getClient(id);
    }
    @GetMapping("/index")
    public ModelAndView clients() {
        ModelAndView modelAndView = new ModelAndView("clients"); // Nom de la vue sans l'extension .html
        return modelAndView;
    }
    @PostMapping("/saveclient")
    public ClientEntity save(@RequestBody ClientEntity ce){
        return cs.save(ce);
    }
    @DeleteMapping("/deleteclient")
    public void deleteclient(@RequestParam Integer id){
        cs.deleteclient(id);
    }
    @PutMapping("/updateclient")
    public ClientEntity update(@RequestBody ClientEntity ce){
        return cs.update(ce);
    }




}