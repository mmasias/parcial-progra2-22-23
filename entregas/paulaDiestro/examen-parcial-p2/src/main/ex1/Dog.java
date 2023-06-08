package main.ex1;

class Dog extends Pet {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
