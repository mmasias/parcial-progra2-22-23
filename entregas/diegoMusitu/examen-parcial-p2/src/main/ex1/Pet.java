package main.ex1;

public abstract class Pet {
    String name;
    String color;
    int age;
    <Create> Pet(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    String getName(){
        return name;
    }
}
