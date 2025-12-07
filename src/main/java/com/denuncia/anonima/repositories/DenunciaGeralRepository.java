package com.denuncia.anonima.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denuncia.anonima.entities.DenunciaGeralEntity;

@Repository
public interface DenunciaGeralRepository extends JpaRepository<DenunciaGeralEntity, Long> {

}
