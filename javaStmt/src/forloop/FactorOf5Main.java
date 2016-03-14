package forloop;

import java.util.Scanner;

/**
 * @package : forloop
 * @file : FactorOf5.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 5의 배수의 갯수 와 합
 */
public class FactorOf5Main {
	/**
	 * [결과] 1에서 100까지 정수까지 5 배수의 갯수는 20이고 5 배수의 합은 1050이다
	 */
	public static void main(String[] args) {
		FactorOf5 fo = new FactorOf5();
		int endNum = 0, count = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("리미트 값 입력");
		fo.setEndNum(scanner.nextInt());
		System.out.println(fo.toString());

		/*
		 * for (int i = 0; i <= endNum; i += 5) { count = endNum / 5; sum += i;
		 * }
		 */

	}
}
