package switchcase;

import java.util.Scanner;

/**
 *@package : ifelse
 *@file : Pass.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 11.
 *@story 과목 점수를 입력하면 총점과 평균이 나오고 
 *이를 통해 합격 여부를 통지하는 프로그램
 *[결과]
 *********************************
 *학생	JAVA   JSP  SQL  SPRING  총점	        평균     합격여부
 *-----------------------------------------------
 *홍길동         80    40   60      70  250  62.5   합격
 ************************************************
 *합격 여부는 60이상이면 합격
 */
public class Pass {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String name ="",pass="";
	int java =0,jsp =0,sql=0,spring=0,total=0;
	double ave =0;
	System.out.println("학생의 이름,java,jsp,sql,spring 순으로 입력하세요");
	name = scanner.next();
	jsp = scanner.nextInt();
	java = scanner.nextInt();
	sql = scanner.nextInt();
	spring = scanner.nextInt();
	total = java+jsp+sql+spring;
	ave = total/4;
	
	switch (total) {
	
	default:
		if(ave > 59.9)
		{
			pass = "합격";
		}else
		{
			pass = "불합격";
		}
		System.out.println("학생\tJAVA\tJSP\tSQL\tSPRING\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------------------------------");
		System.out.println(name+"\t"+java+"\t"+jsp+"\t"+sql+"\t"+sql+"\t"+total+"\t"+ave+"\t"+pass);
		return;
	}
/*	
	switch ((int)average/10) { 
		case 10: case 9: case 8: case 7: case 6: pass ="합격";break; 
 

 		default: pass="불합격"; 
 			break; 
 		} 
*/
	
}
}
