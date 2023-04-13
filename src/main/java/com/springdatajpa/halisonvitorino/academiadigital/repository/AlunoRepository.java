package com.springdatajpa.halisonvitorino.academiadigital.repository;
import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {

    //recupera alunos pela data de nascimento
    @Query("FROM AlunoEntity a WHERE a.dataNascimento = :dataNascimento")
    List<AlunoEntity> findByDataNascimento (String dataNascimento);

    //List<AlunoEntity> findByDataNascimento (LocalDate dataNascimento);
}
