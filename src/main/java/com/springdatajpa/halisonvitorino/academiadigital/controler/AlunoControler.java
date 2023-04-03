package com.springdatajpa.halisonvitorino.academiadigital.controler;

import com.springdatajpa.halisonvitorino.academiadigital.entity.AlunoEntity;
import com.springdatajpa.halisonvitorino.academiadigital.entity.form.AlunoForm;
import com.springdatajpa.halisonvitorino.academiadigital.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoControler {
    @Autowired
    private AlunoService service;

    //@PostMapping()
    //public AlunoEntity create(@RequestBody AlunoForm form){
        //return service.create(form);
    //}
    @GetMapping("/alunos")
    public List<AlunoEntity> getAll() {
        return service.getAll();
    }
    //@GetMapping("/buscarAlunoNome/{name}")
    //public AlunoEntity getOne(@PathVariable("name") String name) {
        //return service.get(name);
    //}
}
