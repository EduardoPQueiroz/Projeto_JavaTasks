package br.com.etechas.tasks.repository;

import br.com.etechas.tasks.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>{
}
