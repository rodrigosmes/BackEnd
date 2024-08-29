package br.edu.ibmec.projeto.backend.task_manager.model;

import java.time.LocalDate;

import lombok.Data;

@Data

public class Task {
    private Integer id;
    private String nome;
    private String owner;
    private String status;
    private LocalDate createdDate;
}
