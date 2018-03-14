package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;

public class DrivingTask implements Task{

    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName(){
        return taskName;
    }

    public String executeTask(){
        return where + using;
    }
    public Boolean isTaskExecuted(){
        return true;
    }
}
