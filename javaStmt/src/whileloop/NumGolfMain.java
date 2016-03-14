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
		int key = 0;
		
		NumGolfBean bean = new NumGolfBean();
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터 랜덤 수 발생");
		bean.setCom();

		/*
		 * while(bean.isFlag() == false) { bean.setPlayer(scanner.nextInt());
		 * if(bean.getCom() == bean.getPlayer()) { System.out.println("일치");
		 * bean.setFlag(true); }else { bean.setCount(bean.getCount()+1);
		 * System.out.println("불일치"); }
		 * 
		 * }
		 */

		System.out.println("[메뉴] 1.숫자 맞추기 2.종료");
		key = scanner.nextInt();
		String msg = "";
		switch (key) {
		case 1:
			while (true) {
				System.out.println("1부터 10까지 숫자 중 하나를 입력");
				System.out.println("난수 값"+bean.getCom());
				System.out.println("도전 횟수는 " +(bean.getCount()+1));
				bean.setPlayer(scanner.nextInt());
				bean.setCount();
				bean.setFlag(true);
				System.out.println(msg = (bean.getCom() == bean.getPlayer()) ?bean.toString(): "랜덤숫자와 불일치");			
			}
			
		case 2: return;
		default:
			System.out.println("잘못된 입력");
			return;
		}
	
	}
	
}
