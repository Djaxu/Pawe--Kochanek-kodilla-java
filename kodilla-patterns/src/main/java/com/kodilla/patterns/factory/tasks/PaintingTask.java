package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }
    public void executeTask(){
        isExecuted = true;
    }

    public Boolean isTaskExecuted(){
        return isExecuted;
    }
    public String getWhatTo(){
        return whatToPaint;
    }
}
