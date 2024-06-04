package com.apprh.repositories;

import com.apprh.domain.models.Candidato;
import com.apprh.domain.models.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
