package com.interviewprep.DesignPatterns.factory;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getInstance("circle");
        Shape triangle = factory.getInstance("triangle");
        Shape rectangle = factory.getInstance("rectangle");
        circle.shape();
        triangle.shape();
        rectangle.shape();
    }
}
