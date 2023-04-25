public class CustomDate extends Appointment{
	int day;
	int month;
	int year;

	public CustomDate() {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	String format(String format) {
		String result = format;
		result = result.replace("dd", String.format("%02d", day));
		result = result.replace("mm", String.format("%02d", month));
		result = result.replace("yyyy", String.format("%04d", year));
		return result;
	}

}
