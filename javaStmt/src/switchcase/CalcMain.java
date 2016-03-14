package switchcase;

import java.util.Scanner;

import javax.print.StreamPrintService;

/**
 * @package : switchcase
 * @file : Calc.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 사칙 연산기
 */
public class CalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 두개의 값과 연산기호를 입력하세요");
		// + - * / 단 나눗셈은 몫과 나머지로 출력
		Calc c = new Calc();
		c.setResult(scanner.nextInt(),scanner.next(),scanner.nextInt());
		System.out.println(c.toString());
		
		
	}
}
