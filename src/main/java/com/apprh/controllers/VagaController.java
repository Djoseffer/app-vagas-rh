package com.apprh.controllers;

import com.apprh.domain.models.Vaga;
import com.apprh.dtos.VagaDTO;
import com.apprh.services.CandidatoService;
import com.apprh.services.VagaService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cadastrar")
public class VagaController {

    @Autowired
    private VagaService vagaService;
    @Autowired
    private CandidatoService candidatoService;

    @GetMapping
    public String form (){
        return "vaga/formVaga";
    }

    @PostMapping
    public ResponseEntity<Vaga> form(@Valid VagaDTO vagaDTO){
        var newRegister = new Vaga();
        BeanUtils.copyProperties(vagaDTO, newRegister);
        vagaService.save(newRegister);
        return ResponseEntity.status(HttpStatus.OK).body(newRegister);
    }

    @GetMapping("/vagas")
    public ResponseEntity<List<Vaga>> listaVagas(){
        var vagas = vagaService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(vagas);
    }

    @GetMapping("/vagas/{id}")
    public ResponseEntity<Object> detalhesVaga(@PathVariable Long id){
        Optional<Vaga> buscaVaga = vagaService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(buscaVaga.get());
    }
}
