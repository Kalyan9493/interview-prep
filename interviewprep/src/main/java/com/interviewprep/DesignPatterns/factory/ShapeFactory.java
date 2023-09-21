package com.interviewprep.DesignPatterns.factory;

public class ShapeFactory {

    public Shape getInstance(String shape){
        if(shape.equals("circle")){
            return new Circle();
        }else if(shape.equals("rectangle")){
            return new Rectangle();
        }else if(shape.equals("triangle")){
            return new Triangle();
        }else{
            System.out.println("Instance not found");
        }
        return null;
    }
}
