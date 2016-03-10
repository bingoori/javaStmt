package bank;

import java.util.Scanner;

public class BankMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름과 비밀번호를 입력하세요");
	AccountBean ab = new AccountBean(scanner.nextLine(), scanner.nextInt());
	System.out.println(ab.toString());
}
}
