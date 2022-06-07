package com.reunioes.marcacaoreunioes.dto;

import com.reunioes.marcacaoreunioes.entities.Sala;

import java.io.Serializable;

public class SalaDTO implements Serializable {
    private static final long serialVersionUID = 7867773368036931386L;

    private Long id;
    private String nome;
    private String localizacao;
    private String disponibilidade;

    public SalaDTO() {
    }

    public SalaDTO(Long id, String nome, String localizacao, String disponibilidade) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.disponibilidade = disponibilidade;
    }

    public SalaDTO(Sala sala) {
        this.id = sala.getId();
        this.nome = sala.getNome();
        this.localizacao = sala.getLocalizacao();
        this.disponibilidade = sala.getDisponibilidade();
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

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
