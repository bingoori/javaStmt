package ifelse;

public class Trinomial {
	private int kor,eng,math,avg;
	private String name;
	
	protected Trinomial(String name,int kor,int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (kor+eng+math)/3;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	public String getAvg() {
		String result =(avg > 59.9)?"합격":"불합격";
		return result;
	}
	@Override
	public String toString() {
		return "[결과] = "+getName()+" 학생은"+ getAvg() +" 입니다." ;
	}
}
