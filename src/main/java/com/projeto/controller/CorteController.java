package com.projeto.controller;

import com.projeto.model.Corte;
import com.projeto.service.CorteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5500")
public class CorteController {
    @Autowired
    private CorteService corteService;

    @PostMapping("/adicionar-corte")
    public Corte cortar(@RequestBody Corte corte){
        System.out.println("Dados recebidos: " + corte);
        corte.setTimestamp(new Date());
        return corteService.addCut(corte);
    }

    @GetMapping("/listar-cortes")
    public List<Corte> listar(){
        return corteService.listar();
    }
}
