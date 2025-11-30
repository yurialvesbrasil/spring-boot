package com.cursos.rocktseat.fernandakipper.service.tasks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @PostMapping()
    public ResponseEntity<TaskEntity> createTask(@RequestBody TaskEntity taskEntity) {
        return ResponseEntity.ok(this.taskRepository.save(taskEntity));
    }
    
    
}
