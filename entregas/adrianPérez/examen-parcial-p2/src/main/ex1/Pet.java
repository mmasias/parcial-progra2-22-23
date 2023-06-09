package main.ex1;

public abstract class Pet {
    protected String name;
    protected String color;
    protected int age;

    public <<Create>> Pet(String, String, int);
    public String getName();
}
