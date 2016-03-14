package ifelse;

public class TimeCalc {
	private int hour, minute, second, time;

	public TimeCalc(int time) {
		this.time = time;
		this.hour = time / 3600;
		this.minute = (time % 3600) / 60;
		this.second = (time % 3600) % 60;

	}

	public int getHour() {
		return hour;
	}



	public int getMinute() {
		return minute;
	}



	public int getSecond() {
		return second;
	}


}
