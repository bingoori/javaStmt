package forloop;

import java.util.Scanner;

/**
 * @package : forloop
 * @file : InputguGugudan.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 입력받은 정수의 구구단 구하기 예를 들면 2를 입력하면 2단 출력 109를 입력하면 109*2 부터 109*9까지 출력 다만,
 *        0과 음수를 입력하면 1이상 정수 값만 입력하시오 라고 출력
 */
public class InputguGugudanMain {
	public static void main(String[] args) {
		InputGugudan ig = new InputGugudan();
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		ig.setInput(scanner.nextInt());
		

		
	}

}