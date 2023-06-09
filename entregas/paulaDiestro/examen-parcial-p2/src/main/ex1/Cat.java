package main.ex1;
class Cat extends Pet {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
