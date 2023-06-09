package main;

public abstract class Pet {
    String name;
    String colour;
    int age;

    public Pet(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public String getName () {
        return name;
    }
}
