package ifelse;

/**
 *@file : kaup.java
 *@author bingoori
 *@date 2016. 3. 10.
 *@story
 */
public class kaup {
	//속성 영역 : Field
	private int kaup;
	private double height, weight;
	private String result,name;
	
	//기능 영역 : Area

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getKaup() {
		return kaup;
	}
	public void setKaup() {
		this.kaup = (int) ((weight/(height*height))*10000);
	}
	public String getResult() {

		return result;
	}
	public void setResult() {
		setKaup();
		String temp = "";
	
		//분기문 영역
		if (kaup > 30) {
			temp = "비만입니다";
		} else if (kaup >= 24) {
			temp = "과체중 입니다.";
		} else if (kaup >= 20) {
			temp = "정상 입니다.";
		} else if (kaup >= 15) {
			temp = "저체중 입니다..";
		} else if (kaup >= 13) {
			temp = "마름 입니다..";
		} else if (kaup >= 10) {
			temp = "영양실조 입니다..";
		}else {
			temp = "소모즁";
		}
		this.result = temp;
	}
	@Override
	public String toString() {
		return "카우푸지수 [이름="+ name + " 결과 "+result+"]";
	}

}
