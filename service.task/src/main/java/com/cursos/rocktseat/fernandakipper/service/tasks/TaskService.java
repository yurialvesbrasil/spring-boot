package com.cursos.rocktseat.fernandakipper.service.tasks;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final NotificationClient notificationClient;

    public TaskService(TaskRepository taskRepository, NotificationClient notificationClient) {
        this.taskRepository = taskRepository;
        this.notificationClient = notificationClient;
    }

    public void sendNotificationForDueTasks(){
        LocalDateTime deadline = LocalDateTime.now().plusDays(1);
        List<TaskEntity> tasks = taskRepository.findDueTasksDueWithinDeadline(deadline);
        for(TaskEntity task : tasks){
            NotificationRequest request = new NotificationRequest("Sua tarefa: " + task.getTitle() + " está para vencer.", task.getEmail());
            notificationClient.sendNotification(request);
            task.setNotified(true);
        }
    }
}
