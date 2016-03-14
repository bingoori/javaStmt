package whileloop;

import java.util.Scanner;

/**
 *@package : whileloop
 *@file : InfiniteLoop.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 14.
 *@story
 */
public class InfiniteLoopMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	InfiniteLoop il = new InfiniteLoop();
	
	int result = 0;
	
	
		System.out.println("1.정수 입력 2.종료"); //메뉴
		int key =scanner.nextInt();
		System.out.println("출력할 정수 값 입력"); //메뉴
		il.setResult(scanner.nextInt());
		il.start(key);
		
		System.out.println(il.getResult());
	
}
}
