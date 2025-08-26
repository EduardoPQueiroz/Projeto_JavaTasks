package br.com.etechas.tasks.controllers;
//Eduardo Queiroz e André Nogueira Pissuto

import br.com.etechas.tasks.dto.TarefaResponseDTO;
import br.com.etechas.tasks.entity.Task;
import br.com.etechas.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{id}")
    public ResponseEntity<Task> excluirTarefa(@PathVariable Long id){
        if(service.excluirPorId(id) == true){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}
