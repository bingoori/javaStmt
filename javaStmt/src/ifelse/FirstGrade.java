package ifelse;

import java.util.Scanner;

/**
 *@package : ifelse
 *@file : FirstGrade.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 11.
 *@story 3명의 학생 점수를 받아서 1등을 출력하는 프로그램
 * [결과]
 */
public class FirstGrade {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("3명의 이름과 점수 입력하세요");
	String aName = scanner.next();
	int aScore = scanner.nextInt();
	String bName = scanner.next();
	int bScore = scanner.nextInt();
	String cName = scanner.next();
	int cScore = scanner.nextInt();
	
	String str = "1등은 "+aName+", "+aScore+"점 입니다.";
	int temp = aScore;
	if (bScore > temp) {
		temp = bScore;
		str = "1등은 "+bName+", "+bScore+"점 입니다.";
	} 
	if(cScore > temp){
		temp = cScore;
		str = "1등은 "+cName+", "+cScore+"점 입니다.";
	}
	
	System.out.println(str);
}
}
