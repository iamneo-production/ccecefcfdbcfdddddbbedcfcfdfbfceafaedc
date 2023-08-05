package com.examly.springapp.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Task;
import com.examly.springapp.service.TaskService;

@RestController
public class TaskController{
    @Autowired
    private TaskService taskService;

    @PostMapping("/saveTask")
    public Task saveTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }

    @GetMapping("/changeStatus")
    public Task changeStatus(@RequestParam Long id,@RequestParam String newStatus){
        return taskService.changeStatus(id,newStatus);
    }

    @GetMapping("/deleteTask")
    public void deleteTask(@RequestParam Long id){
        taskService.deleteTask(id);
    }

    @GetMapping("/alltasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/getTask")
    public List<Task> getTask(@RequestParam String taskHolderName){
        return taskService.getTasksByTaskHoldername(taskHolderName);
    }
}