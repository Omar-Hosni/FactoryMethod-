package com.company;

public class AnimalFactory {

    public Animal getAnimal(String AnimalName){
        if(AnimalName == null){
            AnimalName = null;
        }
        if(AnimalName.equalsIgnoreCase("TIGER")){
            return new Tiger();
        }else if(AnimalName.equalsIgnoreCase("DUCK")){
            return new Duck();
        }
        return null;
    }
}
