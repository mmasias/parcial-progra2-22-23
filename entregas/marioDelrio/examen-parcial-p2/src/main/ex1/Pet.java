package main.ex1;

public class Pet {
    String name;
    String color;
    int age;

    public Pet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    String getName() {
        return name;
    }
}
