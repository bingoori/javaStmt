package whileloop;

import java.util.Scanner;

/**
 *@package : whileloop
 *@file : InfiniteLoop.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 14.
 *@story
 */
public class InfiniteLoop {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int result = 0;
	
	while (true) {
		System.out.println("1.정수 입력 2.종료"); //메뉴
		int key =scanner.nextInt();
		switch (key) {
		case 1: System.out.println("출력할 정수 값 입력");
			result = scanner.nextInt();
			break;
		case 2: System.out.println("종료 합니다.");
			return;

		default: System.out.println("잘못 된 값");
			return;
		}
		System.out.println(result);
	}
}
}
