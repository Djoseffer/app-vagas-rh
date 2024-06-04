package com.apprh.domain.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Candidato {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String rg;
    @NotEmpty
    private String nomeCandidato;
    @NotEmpty
    private String email;
    @ManyToOne
    private Vaga vaga;
}
