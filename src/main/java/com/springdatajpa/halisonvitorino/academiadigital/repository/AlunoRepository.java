package com.springdatajpa.halisonvitorino.academiadigital.repository;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {

}
