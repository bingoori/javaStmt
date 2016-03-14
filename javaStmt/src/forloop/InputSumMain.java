package forloop;

import java.util.Scanner;

/**
 * @package : forloop
 * @file : InputSum.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 1부터 입력된 수만큼 합 구하기 예) 10을 입력하면 콘솔에는 1부터 10까지의 합은 55 입니다.
 */
public class InputSumMain {
	public static void main(String[] args) {
		InputSum is = new InputSum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		is.setInput(scanner.nextInt());
		System.out.println(is.getSum());

	}
}
