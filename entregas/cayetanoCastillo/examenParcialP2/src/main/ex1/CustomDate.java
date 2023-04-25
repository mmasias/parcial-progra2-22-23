package main.ex1;

public class CustomDate {
	private int day;
	private int month;
	private int year;
	
	public CustomDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		String a = " ";
		 String day = new String();
		 String month = new String();
		 String year = new String();
		 a = day + " / " + month + " / " + year;
		return a;
	}
	
	public void Read(String a) {
		System.out.println(a);
	}
	
	
}
