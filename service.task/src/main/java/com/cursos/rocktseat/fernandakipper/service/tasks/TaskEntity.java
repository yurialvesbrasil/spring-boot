package com.cursos.rocktseat.fernandakipper.service.tasks;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Task")
@Table(name= "task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String email;
    private LocalDateTime dueDate;
    private boolean notified;
}
