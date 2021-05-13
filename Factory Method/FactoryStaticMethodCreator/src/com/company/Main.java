package com.company;

interface Shape{
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("I am a rectangle");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("Im a square");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Im a circle");
    }
}

class Main{
    public static void main(String[] args){
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();
    }
}

