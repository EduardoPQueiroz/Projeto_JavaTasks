package br.com.etechas.tasks.dto;

import br.com.etechas.tasks.enums.StatusEnum;

import java.time.LocalDate;

public record CadastroTarefaDTO(
        String titulo,
        String responsavel,
        LocalDate dataLimite,
        StatusEnum statusEnum
) {
}
