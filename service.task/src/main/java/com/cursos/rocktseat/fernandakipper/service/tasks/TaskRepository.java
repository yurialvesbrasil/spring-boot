package com.cursos.rocktseat.fernandakipper.service.tasks;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long>{

    @Query("SELECT t FROM Task t WHERE t.dueDate <= :deadline AND t.notified = false")
    List<TaskEntity> findDueTasksDueWithinDeadline(LocalDateTime deadline);
    
}
