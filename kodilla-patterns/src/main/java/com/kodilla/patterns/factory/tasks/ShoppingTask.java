package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName(){
        return taskName;
    }
    public void executeTask(){
        isExecuted = true;
    }

    public Boolean isTaskExecuted(){
        return isExecuted;
    }
    public String getWhatTo(){
        return whatToBuy;
    }
}
