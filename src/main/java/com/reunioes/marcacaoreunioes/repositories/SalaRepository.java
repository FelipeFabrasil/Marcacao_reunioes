package com.reunioes.marcacaoreunioes.repositories;

import com.reunioes.marcacaoreunioes.entities.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {

}
