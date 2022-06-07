package com.reunioes.marcacaoreunioes.dto;

import com.reunioes.marcacaoreunioes.entities.Reuniao;
import com.reunioes.marcacaoreunioes.entities.Sala;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReuniaoDTO implements Serializable {
    private static final long serialVersionUID = -5324838501581170787L;

    private Long id;
    private Instant data;
    private List<SalaDTO> sala = new ArrayList<>();

    public ReuniaoDTO() {
    }

    public ReuniaoDTO(Long id, Instant data) {
        this.id = id;
        this.data = data;
    }

    public ReuniaoDTO(Reuniao reuniao) {
        this.id = reuniao.getId();
        this.data = reuniao.getData();
    }

    public ReuniaoDTO(Reuniao reuniao, Set<Sala> sala) {
        this(reuniao);
        sala.forEach(x -> this.sala.add(new SalaDTO(x)));
    }

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

    public List<SalaDTO> getSala() {
        return sala;
    }

    public void setSala(List<SalaDTO> sala) {
        this.sala = sala;
    }
}
