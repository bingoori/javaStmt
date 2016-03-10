package ifelse;

import java.util.Scanner;

public class kaup {

	public static void main(String[] args) {
		
		
		//지역변수
		int kaup = 0;
		String result = "", name = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력");
		name = sc.next();
		//분기문 영역
		if (kaup > 30) {
			result = "비만입니다";
		} else if (kaup >= 24) {
			result = "과체중 입니다.";
		} else if (kaup >= 20) {
			result = "정상 입니다.";
		} else if (kaup >= 15) {
			result = "저체중 입니다..";
		} else if (kaup >= 13) {
			result = "마름 입니다..";
		} else if (kaup >= 10) {
			result = "영양실조 입니다..";
		}else {
			result = "소모즁";
		}
		System.out.println(result);
	}

}
