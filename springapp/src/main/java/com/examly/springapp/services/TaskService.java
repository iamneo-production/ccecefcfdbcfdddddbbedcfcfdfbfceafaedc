package com.examly.springapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Task;
import com.examly.springapp.repository.TaskRepository;
@Service
public class TaskService{
    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task){
        return taskRepository.save(task);
    }

    public Task changeStatus(Long taskid,String newStatus){
        Task task=taskRepository.findById(taskid).orElse(null);
        if(task!=null){
            task.setTaskStatus(newStatus);
            taskRepository.save(task);
        }
        return task;
    }

    public void deleteTask(Long taskid){
         taskRepository.deleteById(taskid);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public List<Task> getTasksByTaskHoldername(String taskHolderName){
        return taskRepository.findByTaskHolderName(taskHolderName);
    }
}