package br.com.etechas.tasks.entity;

import br.com.etechas.tasks.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "TB_TASKS")
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_task")
    private Long id;

    @Column(name = "titulo_task")
    private String titulo;

    @Column(name = "descricao_task")
    private String descricao;

    @Column (name = "responsavel_task")
    private String responsavel;

    @Column(name = "dataLimite_task")
    private LocalDate dataLimite;

    @Column(name = "status_task")
    @Enumerated(EnumType.STRING)
    private StatusEnum statusEnum;
}
