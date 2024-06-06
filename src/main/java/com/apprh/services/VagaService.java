package com.apprh.services;

import com.apprh.domain.models.Vaga;
import com.apprh.repositories.VagaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VagaService {
    private VagaRepository vagaRepository;
    public void save(Vaga vaga) {
        vagaRepository.save(vaga);
    }

    public List<Vaga> getAll() {
        return vagaRepository.findAll();
    }

    public Optional<Vaga> findById(Long id) {
        if (findById(id).isPresent()){
            return vagaRepository.findById(id);
        } throw new RuntimeException("Id not found");
    }
}
