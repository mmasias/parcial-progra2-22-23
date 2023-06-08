package src.main.ex1;

public class CustomDate extends Pet {
	private int day;
	private int month;
	private int year;
	public CustomDate(int day, int month, int year) {
		super(String.valueOf(day), String.valueOf(month), year);
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	public String format(String format) {
		return format.replace("dd", String.valueOf(this.day))
				.replace("mm", String.valueOf(this.month))
				.replace("yyyy", String.valueOf(this.year));
	}

}
