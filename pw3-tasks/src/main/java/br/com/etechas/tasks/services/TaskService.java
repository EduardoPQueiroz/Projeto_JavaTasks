package br.com.etechas.tasks.services;

import br.com.etechas.tasks.dto.TarefaResponseDTO;
import br.com.etechas.tasks.entity.Task;
import br.com.etechas.tasks.mapper.TarefaMapper;
import br.com.etechas.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    @Autowired
    private TarefaMapper tarefaMapper;

    public List<TarefaResponseDTO> listarTarefas(){

        return tarefaMapper.toResponseDTOList(repository.findAll());
    }
}
