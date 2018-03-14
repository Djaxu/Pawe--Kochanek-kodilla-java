package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }
    public String executeTask(){
        return whatToPaint + color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
    public Boolean isTaskExecuted(){
        return true;
    }
}
