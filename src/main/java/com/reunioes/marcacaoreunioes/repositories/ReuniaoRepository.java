package com.reunioes.marcacaoreunioes.repositories;

import com.reunioes.marcacaoreunioes.entities.Reuniao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReuniaoRepository extends JpaRepository<Reuniao, Long> {
    //repositorio jpa que faz a conecçao com o banco de dados
}
