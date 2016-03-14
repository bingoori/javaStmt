package ifelse;

public class FirstGrade {
private String aName,bName,cName;
private int aScore,bScore,cScore;
	public FirstGrade(String aName, int aScore, String bName, int bScore, String cName, int cScore) {
	
		this.aName = aName;
		this.bName = bName;
		this.cName = cName;
		this.aScore = aScore;
		this.bScore = bScore;
		this.cScore = cScore;
	
}
	public String Result() {
		String str = "1등은 " + this.aName + ", " + this.aScore + "점 입니다.";
		int temp = this.aScore;
		if (this.bScore > temp) {
			temp = this.bScore;
			str = "1등은 " + this.bName + ", " + this.bScore + "점 입니다.";
		}
		if (cScore > temp) {
			temp = cScore;
			str = "1등은 " + this.cName + ", " + this.cScore + "점 입니다.";
		}
		return str;
	}
}
