package switchcase;

public class MonthEndDay {
private int month,endDay;

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
	
	switch (month) {
	case 1:	case 3:	case 5: case 7:	case 8:	case 10:
	case 12:
		this.endDay = 31;
		break;
	case 4: case 6:	case 9:
	case 11:
		this.endDay = 30;
		break;
	case 2:
		this.endDay = 29;
		break;
	default:
		System.out.println("잘못된 값");
		return;
	}
}

public int getEndDay() {
	return endDay;
}

public void setEndDay(int endDay) {
	this.endDay = endDay;
}
}
