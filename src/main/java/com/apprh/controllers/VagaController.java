package com.apprh.controllers;

import com.apprh.repositories.CandidatoRepository;
import com.apprh.repositories.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cadastrar")
public class VagaController {

    @Autowired
    private VagaRepository vgRepository;
    @Autowired
    private CandidatoRepository cdRepository;

    @GetMapping
    public String form (){
        return "vaga/formVaga";
    }
}
