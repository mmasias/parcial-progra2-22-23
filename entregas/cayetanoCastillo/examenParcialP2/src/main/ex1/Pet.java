package main.ex1;

public class Pet {

	protected String nameP;
	protected String color;
	protected int age;
	
	
	
	public Pet(String nameP, String color, int age) {
		super();
		this.nameP = nameP;
		this.color = color;
		this.age = age;
	}



	public String getNameP() {
		return nameP;
	}



	public void setNameP(String nameP) {
		this.nameP = nameP;
	}
	
	
}
