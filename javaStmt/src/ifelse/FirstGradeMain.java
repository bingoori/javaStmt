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
public class FirstGradeMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("3명의 이름과 점수 입력하세요");
	String aName = scanner.next();
	int aScore = scanner.nextInt();
	String bName = scanner.next();
	int bScore = scanner.nextInt();
	String cName = scanner.next();
	int cScore = scanner.nextInt();
	
	FirstGrade fg = new FirstGrade(aName,aScore,bName,bScore,cName,cScore);
	System.out.println(fg.Result());
	
	

}
}
