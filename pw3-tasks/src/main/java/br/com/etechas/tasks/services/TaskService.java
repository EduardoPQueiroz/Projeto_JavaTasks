package br.com.etechas.tasks.services;

import br.com.etechas.tasks.entity.Task;
import br.com.etechas.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private TaskRepository repository;

    public List<Task> listarTarefas(){
        return repository.findAll();
    }
}
