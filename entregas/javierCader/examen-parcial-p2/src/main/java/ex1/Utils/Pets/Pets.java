package ex1.Utils.Pets;

public abstract class  Pets {
    protected String name;
    protected String color;
    protected int age;

    public Pets(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

}
