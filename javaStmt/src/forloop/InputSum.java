package forloop;

import java.util.Scanner;

/**
 *@package : forloop
 *@file : InputSum.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 11.
 *@story 1부터 입력된 수만큼 합 구하기
 *예) 10을 입력하면 콘솔에는 1부터 10까지의 합은 55 입니다.
 */
public class InputSum {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	int sum = 0;
	System.out.println("정수를 입력하세요");
	for (int i = 1; i <= input; i++) {
		sum += i;
	}
	System.out.println("정수의 합은 "+sum);
}
}
