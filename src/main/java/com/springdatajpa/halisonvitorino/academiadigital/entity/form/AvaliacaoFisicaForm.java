package com.springdatajpa.halisonvitorino.academiadigital.entity.form;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

    @Positive(message = "O '${validatedValue}' do aluno precisa ser positivo")
    private Long alunoId;

    @NotNull(message = "Campo não pode estar vazio.")
    @Positive(message = "'${validatedValue}' precisa ser positivo")
    private double peso;

    @NotNull(message = "Campo não pode estar vazio.")
    @Positive(message = "'${validatedValue}' precisa ser positivo")
    @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
    private double altura;
}

