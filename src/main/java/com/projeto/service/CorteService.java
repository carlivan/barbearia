package com.projeto.service;

import com.projeto.model.Corte;
import com.projeto.repository.CorteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorteService {
    @Autowired
    private CorteRepository corteRepository;

    public Corte addCut(Corte corte){
        return corteRepository.save(corte);
    }

    public List<Corte> listar(){
        return corteRepository.findAll();
    }
}
