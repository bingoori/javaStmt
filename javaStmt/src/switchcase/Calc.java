package switchcase;

import java.util.Scanner;

/**
 * @package : switchcase
 * @file : Calc.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 사칙 연산기
 */
public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 두개의 값과 연산기호를 입력하세요");
		int a = scanner.nextInt(),b=scanner.nextInt(),result = 0,mok=0,nmg=0;
		String opcode = scanner.next();
		// + - * / 단 나눗셈은 몫과 나머지로 출력
		
		switch (opcode) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			mok = a / b;
			nmg = a % b;
			System.out.println("몫과 나머지는 "+ mok +","+ nmg + "입니다.");
			return;
		default:
		System.out.println("연산기호를 잘못 입력");
			return;
		}
		System.out.println(a+opcode+b+"="+result);
		
		
	}
}
