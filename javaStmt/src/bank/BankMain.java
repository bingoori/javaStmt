package bank;

import java.util.HashMap;
import java.util.Scanner;

public class BankMain {
public static void main(String[] args) {
	//지역 변수 영역
	Scanner scanner = new Scanner(System.in);
	//연산 영역
	System.out.println("이름과 비밀번호를 입력하세요");
/**
 * 유저
 * */
/*	BankServiceImpl UserService = new BankServiceImpl();
	
	System.out.println(UserService.openAccount(scanner.next(), scanner.nextInt()));
	System.out.println("입금");
	System.out.println(UserService.deposit(scanner.nextInt())+"입금 되었습니다");
	
	System.out.println("출금");
	System.out.println(UserService.withdraw(scanner.nextInt())+"출금 되었습니다.");
	
	System.out.println("잔액");
	System.out.println(UserService.findMoney());
	*/
	
	/**
	 * 관리자
	 * */
	
	AdminServiceImpl service = new AdminServiceImpl(5);
	
	System.out.println(service.openAccount(scanner.next(), scanner.nextInt()));
	System.out.println(service.openAccount(scanner.next(), scanner.nextInt()));
	System.out.println(service.openAccount(scanner.next(), scanner.nextInt()));
	/*	System.out.println("전체 계좌수 조회");
	System.out.println(service.countAll());
	System.out.println("이름 입력");
	System.out.println("countByName 유저 계좌카운트 수");
	System.out.println(service.countByName(scanner.next()));
	System.out.println("이름으로 계좌 조회");
	AccountBean[] bean = service.findAccountsByName(scanner.next());
	for (int i = 0; i < bean.length; i++) {
	System.out.println(bean[i].toString());	
	}
	System.out.println("계좌번호 조회");
	AccountBean beans = service.findAccountByAccountNo(scanner.nextInt());
	System.out.println(beans.toString());*/
	System.out.println("계좌해지");
	System.out.println(service.closeAccount(scanner.nextInt()));
}
}
