package main.ex1;

public abstract class Pet {
    protected String name;
    private int age;
    private String color;

    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    private String getName() {
        return name;
    }
}
