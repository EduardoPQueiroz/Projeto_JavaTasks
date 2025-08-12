package br.com.etechas.tasks.controllers;

import br.com.etechas.tasks.dto.TarefaResponseDTO;
import br.com.etechas.tasks.entity.Task;
import br.com.etechas.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Tasks")
public class TaskController {

    @Autowired
    private TaskService service;


    @GetMapping
    public List<TarefaResponseDTO> listar(){
        return service.listarTarefas();
    }

}
