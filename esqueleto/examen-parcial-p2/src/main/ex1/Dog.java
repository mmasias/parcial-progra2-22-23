package main.ex1;

public class Dog extends Pet{
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    String getName() {
        return this.name;
    }
}
