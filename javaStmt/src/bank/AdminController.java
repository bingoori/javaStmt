package bank;

import java.util.Scanner;

public class AdminController {
	// 관리자
	public static void main(String[] args) {
		AdminServiceImpl2 Managerservice = new AdminServiceImpl2(5);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴] 1.개설 2.목록 3.조회(계좌번호) 4.조회(이름) 5.계좌수 6.계좌해지 7.종료");

			switch (scanner.nextInt()) {
			case 1:
				System.out.println("개설할 계좌의 이름과 비밀번호를 입력하세요");
				System.out.println(Managerservice.openAccount(scanner.next(), scanner.nextInt()));
				break;
			case 2:
				System.out.println("전체 계좌 목록 조회");
				System.out.println(Managerservice.getList());
				break;
			case 3:
				System.out.println("계좌번호 조회");
				AccountBean beans = Managerservice.findAccountByAccountNo(scanner.nextInt());
				System.out.println(beans.toString());
				break;
			case 4:
				System.out.println("이름으로 계좌 조회");
				AccountBean[] bean = Managerservice.findAccountsByName(scanner.next());
				for (int i = 0; i < bean.length; i++) {
					System.out.println(bean[i].toString());
				}
				break;
			case 5:
				System.out.println("전체 계좌수 조회");
				System.out.println(Managerservice.countAll());
				break;
			case 6:
				System.out.println("계좌해지");
				System.out.println(Managerservice.closeAccount(scanner.nextInt()));
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
