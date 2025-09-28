package com.cloud.yagodev.cadastroninja.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class Missao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Character rank;

    public Missao() {
    }

    public Missao(Long id, String nome, Character rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getRank() {
        return rank;
    }

    public void setRank(Character rank) {
        this.rank = rank;
    }
}
