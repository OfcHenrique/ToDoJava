package com.henrique.todo_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotBlank (message = "O título não pode ser vazio")
    @Size (min = 3, message = "O título precisa ter no mínimo 3 caracteres")
    private String titulo;

    @NotBlank(message = "A descrição não pode ser vazia")
    @Size(min = 5, message = "A descrição precisa ter no mínimo 5 caracteres")
    private String descricao;

    private Boolean concluida = false;
    private LocalDateTime dataCriacao = LocalDateTime.now();
}
