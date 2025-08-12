package br.com.etechas.tasks.mapper;

import br.com.etechas.tasks.dto.TarefaResponseDTO;
import br.com.etechas.tasks.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefaMapper {
    TarefaMapper INSTANCE = Mappers.getMapper(TarefaMapper.class);

    List<TarefaResponseDTO> toResponseDTOList(List<Task> tarefa);
}
