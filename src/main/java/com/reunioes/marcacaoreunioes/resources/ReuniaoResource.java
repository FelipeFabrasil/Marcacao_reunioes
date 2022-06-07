package com.reunioes.marcacaoreunioes.resources;

import com.reunioes.marcacaoreunioes.dto.ReuniaoDTO;
import com.reunioes.marcacaoreunioes.dto.SalaDTO;
import com.reunioes.marcacaoreunioes.services.ReuniaoService;
import com.reunioes.marcacaoreunioes.services.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/reunioes")
public class ReuniaoResource {
    // mapeando os endpoints

    // injeção de dependicias do serviço
    @Autowired
    private ReuniaoService service;

    //metodo que consulta salas

    @GetMapping
    public ResponseEntity<List<ReuniaoDTO>> consultaSalas() {
        List<ReuniaoDTO> list = service.consultaReunioes();
        return ResponseEntity.ok(list);
    }

    //metodo que faz o cadastro das salas
    @PostMapping
    public ResponseEntity<ReuniaoDTO> cadastroSalas(@RequestBody ReuniaoDTO dto) {
        dto = service.cadastroReunioes(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
}
