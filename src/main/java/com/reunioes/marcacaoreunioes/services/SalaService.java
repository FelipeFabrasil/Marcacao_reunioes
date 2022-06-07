package com.reunioes.marcacaoreunioes.services;

import com.reunioes.marcacaoreunioes.dto.SalaDTO;
import com.reunioes.marcacaoreunioes.entities.Sala;
import com.reunioes.marcacaoreunioes.repositories.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SalaService {

    @Autowired
    private SalaRepository repository;

    @Transactional(readOnly = true)
    public List<SalaDTO> consultaSalas() {
        List<Sala> list = repository.findAll();
        return list.stream().map(x -> new SalaDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public SalaDTO cadastroSalas(SalaDTO dto) {
        Sala sala = new Sala();
        sala.setNome(dto.getNome());
        sala.setLocalizacao(dto.getLocalizacao());
        sala.setDisponibilidade("disponível");
        sala = repository.save(sala);
        return new SalaDTO(sala);
    }
}
