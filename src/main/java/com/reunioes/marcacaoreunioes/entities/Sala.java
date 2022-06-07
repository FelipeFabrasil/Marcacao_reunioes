package com.reunioes.marcacaoreunioes.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_sala")
public class Sala implements Serializable {
    private static final long serialVersionUID = -783743687095199722L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String localizacao;
    private String disponibilidade;

    public Sala() {
    }

    public Sala(Long id, String nome, String localizacao, String disponibilidade) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.disponibilidade = disponibilidade;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
