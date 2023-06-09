package main.ex1;

import java.util.List;

public class Cat extends Pet {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String getName() {
        return "Cat: " + name;
    }
}