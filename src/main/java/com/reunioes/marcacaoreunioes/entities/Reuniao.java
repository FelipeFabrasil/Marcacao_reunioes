package com.reunioes.marcacaoreunioes.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_reuniao")
public class Reuniao implements Serializable {
    private static final long serialVersionUID = -5324838501581170787L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant data;

// relacionamentos muitos pra muitos
    @ManyToMany
    @JoinTable(name = "tb_sala_reuniao",
                joinColumns = @JoinColumn(name = "reuniao_id"),
                inverseJoinColumns = @JoinColumn(name = "sala_id"))
    Set<Sala> sala = new HashSet<>();

     //construtores - para poder estanciar os objetos
    public Reuniao() {
    }

    public Reuniao(Long id, Instant data, Sala sala) {
        this.id = id;
        this.data = data;
    }

     //get e set - metodos para acessar os atributos

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public Set<Sala> getSala() {
        return sala;
    }

    public void setSala(Set<Sala> sala) {
        this.sala = sala;
    }
}
