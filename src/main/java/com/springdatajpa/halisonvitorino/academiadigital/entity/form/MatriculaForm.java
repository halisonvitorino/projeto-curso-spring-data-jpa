package com.springdatajpa.halisonvitorino.academiadigital.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

    @NotNull(message = "Dados inválidos")
    @Positive(message = "Insira um valor positivo")
    private Long alunoId;
}
