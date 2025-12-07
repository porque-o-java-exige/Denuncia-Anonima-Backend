package com.denuncia.anonima.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denuncia.anonima.entities.DenunciaMulherEntity;

@Repository
public interface DenunciaMulherRepository extends JpaRepository<DenunciaMulherEntity, Long> {

}
