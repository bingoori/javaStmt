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
public class TaxMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Tax t = new Tax();
	
	System.out.println("이름을 입력");	
	t.setName(scanner.next());
	System.out.println("연봉을 입력");
	 t.setSal(scanner.nextInt());
	 t.setResult();
	System.out.println("연봉 "+t.getSal()+"원을 받으시는 "+t.getName()+ "님께서");
	System.out.println("이번달 납부할 세금은 "+t.getResult()+"원 입니다.");
}
}
