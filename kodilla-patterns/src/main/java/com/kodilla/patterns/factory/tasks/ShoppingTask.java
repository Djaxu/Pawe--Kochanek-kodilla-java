package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private Boolean isExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName(){
        return taskName;
    }
    public String executeTask(){
        return whatToBuy + quantity;
    }

    public Boolean isTaskExecuted(){
        return isExecuted;
    }
}
