package phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneMain main = new PhoneMain();
		// main.usePhone(scanner); //집전화
		// main.useNokia(scanner);
		// main.useIPhone(scanner);
		main.useAndroid(scanner);
	}

	public  void useAndroid(Scanner scanner) {
		AndroidPhone aPhone = new AndroidPhone();
		aPhone.setCompany("Samsung");
		System.out.println(aPhone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람 ? : 보낼메시지 ?");
		aPhone.setData(scanner.next(), scanner.next(), "13인치");
		System.out.println(aPhone.getData());
	}

	public  void useIPhone(Scanner scanner) {
		IPhone iPhone = new IPhone();
		iPhone.setCompany("Apple");
		System.out.println(iPhone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람 ? : 보낼메시지 ? : 사용하는 핸드폰 사이즈");
		iPhone.setData(scanner.next(), scanner.next());
		System.out.println(iPhone.getData());
	}

	public  void useNokia(Scanner scanner) {
		System.out.println("=== 핸드폰으로 전화 ===");
		Phone nokia = new CellPhone();
		nokia.setCompany("Nokia");
		System.out.println(nokia.getCompany() + "를 사용");
		System.out.println("핸드폰으로 전화할 사람 ?");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCall());
	}

	public  void usePhone(Scanner scanner) {
		System.out.println("=== 집 전화기로 통화 ===");
		Phone hphone = new Phone();
		hphone.setCompany("삼성전자 집 전화기");
		System.out.println(hphone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람 ?");
		hphone.setCall(scanner.next());
		System.out.println(hphone.getCall());
	}

}
