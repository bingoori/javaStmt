package ifelse;

public class GradeReport {
private String name,subject,score2;
private int score1;


public GradeReport(String name,String subject ,int score1) {
	this.name = name;
	this.subject = subject;
	this.score1 = score1;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getScore2() {
	return score2;
}
public void setScore2() {
	
	if (score1 >= 90) {
		this.score2 = "A";
	} else if (score1 >= 80) {
		this.score2 = "B";
	} else if (score1 >= 70) {
		this.score2 = "C";
	} else if (score1 >= 60) {
		this.score2 = "D";
	} else if (score1 >= 50) {
		this.score2 = "E";
	} else if (score1 < 50) {
		this.score2 = "F";
	}
	
}
public int getScore1() {
	return score1;
}
public void setScore1(int score1) {
	this.score1 = score1;
}


}
