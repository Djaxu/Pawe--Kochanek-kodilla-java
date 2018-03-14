package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPINGTASK = "SHOPINGTASK";
    public static final String PAINTINGTASK= "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskName){

        switch (taskName){
            case SHOPINGTASK :
                return new ShoppingTask("Shopping","Eggs",15.0);
            case PAINTINGTASK :
                return new PaintingTask("Painting","Blue","Wall");
            case DRIVINGTASK :
                return new DrivingTask("JoiRide","No where","Car");
                default:
                    return null;
        }
    }
}
