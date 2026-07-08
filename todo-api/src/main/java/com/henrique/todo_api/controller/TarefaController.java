package com.henrique.todo_api.controller;

import com.henrique.todo_api.model.Tarefa;
import com.henrique.todo_api.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> listarTodas() {
        return tarefaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
        return tarefaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tarefa criar(@Valid @RequestBody Tarefa tarefa) {
        return tarefaService.criar(tarefa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return ResponseEntity.ok(tarefaService.atualizar(id, tarefa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        tarefaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}