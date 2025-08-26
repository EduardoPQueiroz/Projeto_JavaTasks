package br.com.etechas.tasks.services;
//Eduardo Queiroz e André Nogueira Pissuto
import br.com.etechas.tasks.dto.TarefaResponseDTO;
import br.com.etechas.tasks.entity.Task;
import br.com.etechas.tasks.enums.StatusEnum;
import br.com.etechas.tasks.mapper.TarefaMapper;
import br.com.etechas.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    @Autowired
    private TarefaMapper tarefaMapper;

    public List<TarefaResponseDTO> listarTarefas(){

        return tarefaMapper.toResponseDTOList(repository.findAll());
    }

    public boolean excluirPorId(Long id){

        Optional<Task> task = repository.findById(id);
        if (task.isPresent()){
            if (task.get().getStatusEnum() == StatusEnum.PENDING){
                repository.deleteById(id);
                return true;
            }
            else{
                throw new RuntimeException("VOCÊ SÓ PODE ALTERAR TAREFAS COM STATUS PENDENTE");
            }
        }
        else{
            return false;
        }
    }
}
