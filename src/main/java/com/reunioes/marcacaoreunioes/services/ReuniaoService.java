package com.reunioes.marcacaoreunioes.services;

import com.reunioes.marcacaoreunioes.dto.ReuniaoDTO;
import com.reunioes.marcacaoreunioes.dto.SalaDTO;
import com.reunioes.marcacaoreunioes.entities.Reuniao;
import com.reunioes.marcacaoreunioes.entities.Sala;
import com.reunioes.marcacaoreunioes.repositories.ReuniaoRepository;
import com.reunioes.marcacaoreunioes.repositories.SalaRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReuniaoService {
//logica da aplicação

    @Autowired
    private ReuniaoRepository repository;

    @Autowired
    private SalaRepository salaRepository;

    @Transactional(readOnly = true) // boa pratica
    public List<ReuniaoDTO> consultaReunioes() {
        List<Reuniao> list = repository.findAll();
        return list.stream().map(x -> new ReuniaoDTO(x, x.getSala())).collect(Collectors.toList());
    }

    @Transactional
    public ReuniaoDTO cadastroReunioes(ReuniaoDTO dto) {
        Reuniao reuniao = new Reuniao();
        copiarDtoParaEntidade(dto, reuniao);
        reuniao = repository.save(reuniao);
        return new ReuniaoDTO(reuniao);
    }
//metodo para auxiliar no cadastro das reunioes, setar sala para indisponivel

    private void copiarDtoParaEntidade(ReuniaoDTO dto, Reuniao reuniao) {
        reuniao.setData(dto.getData());
        for (SalaDTO salaDTO : dto.getSala()) {
            Sala sala = salaRepository.getReferenceById(salaDTO.getId());
            sala.setDisponibilidade("Indisponível");
            reuniao.getSala().add(sala);
        }
    }
}

