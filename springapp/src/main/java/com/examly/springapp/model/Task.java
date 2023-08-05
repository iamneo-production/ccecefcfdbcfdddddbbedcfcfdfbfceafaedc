package com.examly.springapp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class Task{
    @Id
    @Column(name="taskid")
    private Long taskid;

    @Column(name="taskDate")
    private LocalDate taskDate;

    @Column(name="taskHolderName")
    private String taskHolderName;

    @Column(name="taskName")
    private String taskName;

    @Column(name="taskStatus")
    private String taskStatus;


    public Long getTaskId(){
        return taskid;
    }
    public void setTaskId(long taskid){
        this.taskid=taskid;
    }

    public LocalDate getTaskDate(){
        return taskDate;
    }
    public void setTaskDate(LocalDate taskDate){
        this.taskDate=taskDate;
    }

    public String getTaskHolderName(){
        return taskHolderName;
    }
    public void setTaskHolderName(String taskHolderName){
        this.taskHolderName=taskHolderName;
    }
    
    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String taskName){
        this.taskName=taskName;
    }
    
    public String getTaskStatus(){
        return taskStatus;
    }
    public void setTaskStatus(String taskStatus){
        this.taskStatus=taskStatus;
    }


}