package com.kodilla.testing.shape;

        import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public boolean removeShape(Shape shape){
        boolean result =false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getShape(int shapesNumber){
        Shape theNumber = null;
        if(shapesNumber>=0 && shapesNumber < shapes.size()){
            theNumber = shapes.get(shapesNumber);
        }
        return  theNumber;

    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }



}
