package main.ex1;

public abstract class Pet{
    private String name;
    private String color;
    private int age;

    public Pet(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
}