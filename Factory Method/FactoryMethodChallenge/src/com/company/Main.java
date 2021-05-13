package com.company;

interface Animal{
    void walk();
    void eat();
}

class Duck implements Animal{
    @Override
    public void walk(){
        System.out.println("A duck walking...");
    }
    @Override
    public void eat(){
        System.out.println("Eating grain...");
    }
}

class Tiger implements Animal{
    public void walk(){
        System.out.println("A tiger walking...");
    }
    public void eat(){
        System.out.println("Eating meat...");
    }
}

class Main{
    public static void main(String[] args){

        AnimalFactory a1 = new AnimalFactory();

        Animal FarmAnimal = a1.getAnimal("DUCK");
        FarmAnimal.walk();
        FarmAnimal.eat();

        Animal WildAnimal = a1.getAnimal("TIGER");
        WildAnimal.walk();
        WildAnimal.eat();

    }
}


