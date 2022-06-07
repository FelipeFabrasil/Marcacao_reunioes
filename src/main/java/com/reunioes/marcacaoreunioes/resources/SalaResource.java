package com.reunioes.marcacaoreunioes.resources;

import com.reunioes.marcacaoreunioes.dto.SalaDTO;
import com.reunioes.marcacaoreunioes.services.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salas")
public class SalaResource {

    @Autowired
    private SalaService service;

    @GetMapping
    public ResponseEntity<List<SalaDTO>> consultaSalas() {
        List<SalaDTO> list = service.consultaSalas();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<SalaDTO> cadastroSalas(@RequestBody SalaDTO dto) {
        dto = service.cadastroSalas(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
}
