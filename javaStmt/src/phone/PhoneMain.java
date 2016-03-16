package phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HomePhone(scanner);
	}

	public static void HomePhone(Scanner scanner) {
		System.out.println("=== 집 전화기로 통화 ===");
		Phone phone = new Phone();
		phone.setCompany("삼성전자 집 전화기");
		System.out.println(phone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람 ?");
		phone.setCall(scanner.next());
		System.out.println(phone.getCall());
	}

}
