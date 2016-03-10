package whileloop;

import java.util.Scanner;

/**
 * @file : NumGolfMain.java
 * @author bingoori
 * @date 2016. 3. 10.
 * @story 컴퓨터가 랜덤 생성한 숫자를 가장 빠른 횟수로 맞추는 게임
 */
public class NumGolfMain {
	public static void main(String[] args) {
		NumGolfBean bean = new NumGolfBean();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터 랜덤 수 발생");
		bean.setCom();
		
		
		while(bean.isFlag() == false)
		{
			
			if(bean.getCom() == scanner.nextInt())
			{
				System.out.println("정답");
				bean.setFlag(true);
			}else
			{
				bean.setCount((bean.getCount()+1));
			}
			
		}
		System.out.println(bean.toString());
		
	}
}
