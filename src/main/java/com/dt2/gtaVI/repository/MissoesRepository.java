package com.dt2.gtaVI.repository;

import com.dt2.gtaVI.entities.Missoes;
import com.dt2.gtaVI.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissoesRepository extends JpaRepository<Missoes, Integer>{
    List<Missoes> id(int id);
}