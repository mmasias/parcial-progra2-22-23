package main;

public class Dog extends Pet{
    Pet category = new Pet();
    public Dog(String name, String color, int age){
        category.name = name;
        category.color = color;
        category.age = age;
    }
}
