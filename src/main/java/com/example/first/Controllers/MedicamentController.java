package com.example.first.Controllers;

import com.example.first.Entities.ClientEntity;
import com.example.first.Entities.FactureEntity;
import com.example.first.Entities.MedicamentEntity;
import com.example.first.Services.ClientService;
import com.example.first.Services.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("medicaments")
public class MedicamentController {
    @Autowired
    private MedicamentService ms;
    @GetMapping("/getmedicament")
    public MedicamentEntity getmedicament(@RequestParam Integer id){
        return ms.getMedicament(id);
    }
    @PostMapping("/savemedicament")
    public MedicamentEntity save(@RequestBody MedicamentEntity me){
        return ms.save(me);
    }
    @DeleteMapping("/deletemedicament")
    public void deletemedicament(@RequestParam Integer id){
        ms.deletemedicament(id);

    }
    @PutMapping("/updatemedicament")
    public MedicamentEntity updatemedicament(@RequestBody MedicamentEntity me){
        return ms.update(me);
    }

}