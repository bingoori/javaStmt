package bank2;

import java.util.Scanner;

public class BankMain2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 유저의 입장에서 기능을 수행 한다.
		// 은닉화를 위해 중간의 인터페이스를 구현한 클래스(컨트롤러)를 통해 데이터를 처리
		// Start
		/*
		 * BankServiceImpl2 UserService = new BankServiceImpl2();
		 * System.out.println("이름과 비밀번호를 입력하세요");
		 * System.out.println(UserService.openAccount(scanner.next(),
		 * scanner.nextInt())); System.out.println("입금할 금액을 입력하세요");
		 * System.out.println(UserService.deposit(scanner.nextInt()));
		 * System.out.println("출금할 금액을 입력하세요");
		 * System.out.println(UserService.withdraw(scanner.nextInt()));
		 * System.out.println("남은 잔액");
		 * System.out.println(UserService.findMoney()+"원");
		 */
		// End
		// 관리자의 입장에서 기능을 수행 한다.
		// Start
		AdminServiceImpl2 ManagerService = new AdminServiceImpl2();
		for (int i = 0; i < 3; i++) {
			System.out.println("계좌의 이름과 패스워드를 입력하세요");
			System.out.println(ManagerService.openAccount(scanner.next(), scanner.nextInt()));
		}
		/*
		 * System.out.println("유저의 총 계좌 수");
		 * System.out.println(ManagerService.countByName(scanner.next()));
		 * System.out.println("은행의 총 계좌 수");
		 * System.out.println(ManagerService.countAll());
		 */
		System.out.println("이름을 입력하여 계좌를 조회하세요");
		AccountBean2[] Bean2arr = ManagerService.findAccountsByName(scanner.next());
		for (AccountBean2 Beans2 : Bean2arr) {
			System.out.println(Beans2.toString());
		}
/*		System.out.println("계좌번호를 입력하여 계좌조회하세요");
		AccountBean2 Bean = ManagerService.findAccountByAccountNo(scanner.nextInt());
		System.out.println(Bean.toString());*/
		System.out.println("해지할 계좌번호를 입력하세요");
		System.out.println(ManagerService.closeAccount(scanner.nextInt()));
		
		// End
		scanner.close();

	}
}
