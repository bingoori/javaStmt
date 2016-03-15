package bank;

import java.util.Scanner;

/**
 *@package : bank
 *@file : BankController.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 15.
 *@story
 */
public class BankController {
//고객 화면
	public static void main(String[] args) {
		//지역 변수 영역
		Scanner scanner = new Scanner(System.in);
		//연산 영역
		System.out.println("이름과 비밀번호를 입력하세요");
		
		
		BankServiceImpl UserService = new BankServiceImpl();
		while(true)
		{
			System.out.println("[메뉴] 1.계좌 개설 2.입금  3.출금 4.잔액조회 0.종료");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("개설할 계좌의 이름과 비밀번호를 입력하세요");
				System.out.println(UserService.openAccount(scanner.next(), scanner.nextInt()));
				break;
			case 2:
				System.out.println("입금 금액을 입력하세요");
				System.out.println(UserService.deposit(scanner.nextInt())+"입금 되었습니다");
				break;
			case 3:
				System.out.println("출금할 금액을 입력하세요");
				System.out.println(UserService.withdraw(scanner.nextInt())+"출금 되었습니다.");
				break;
			case 4:
				System.out.println("잔액");
				System.out.println(UserService.findMoney());
				break;
			case 0:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못된 입력");
				return;
			}
		}
	}
}
