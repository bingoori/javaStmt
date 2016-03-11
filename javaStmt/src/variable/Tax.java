package variable;

import java.util.Scanner;

/**
 *@package : variable
 *@file : Tax.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 11.
 *@story 
 *[결과] 
 *연봉 **원을 받으시는 ** 님께서
 *이번달 납부할 세금은 ***만원 입니다.
 *세율은 10%
 */
public class Tax {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름을 입력");
	String name = scanner.next();
	System.out.println("연봉을 입력");
	int money = scanner.nextInt();
	int result = (int)(money*0.1);
	System.out.println("연봉 "+money+"원을 받으시는 "+name+ "님께서");
	System.out.println("이번달 납부할 세금은 "+money+"원 입니다.");
}
}
