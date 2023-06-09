package EX1;

public abstract class Pet {
    String name;
    String color;
    int age;
    public Pet(String name, String color, int age) {

        this.name = name;
        this.color = color;
        this.age = age;

    }

    public String getName() {
        return name;
    }

}
