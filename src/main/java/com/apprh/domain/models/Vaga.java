package com.apprh.domain.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private Long código;
    @NotEmpty
    private String nome;
    @NotEmpty
    private String descricao;
    @NotEmpty
    private String data;
    @NotEmpty
    private String salario;
    @OneToMany(mappedBy = "vaga", cascade = CascadeType.REMOVE)
    List<Candidato> candidatos;
}
