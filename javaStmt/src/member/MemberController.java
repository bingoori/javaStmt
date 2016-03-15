package member;

import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		MemberService service = new MemberServiceImpl();

		while (true) {

			System.out.println("[메뉴] 1.회원가입 2.로그인 3.내 정보 보기 4.내 정보 수정 5.탈퇴 6.종료");
			switch (s.nextInt()) {

			case 1:
				System.out.println("아이디,비번,이름,생년월일,주소 입력");
				/*
				 * System.out.println(service.join(new MemberBean(s.next(),
				 * s.next(), s.next(),s.nextInt(), s.next())) +
				 * "님 회원가입이 완료 되었습니다.");
				 */
				System.out.println(service.join(new MemberBean("a", "1", "a", 1, "a")) + "님 회원가입이 완료 되었습니다.");
				break;
			case 2:
				System.out.println("아이디와 패스워드를 입력하세요");
				System.out.println((service.login(s.next(), s.next()) != null) ? "로그인 완료" : "로그인 실패");

				break;
			case 3:
				System.out.println("내 정보 보기 -> 아이디와 패스워드를 입력하세요");
				String id = s.next();
				System.out.println(((service.login(id, s.next()) != null) ? service.detail(id) : "회원 정보가 일치하지 않습니다."));

				break;
			case 4:
				System.out.println("아이디와 패스를 입력하시고, 수정할 패드워드,생년월일,주소를 입력하세요");
				id = s.next();
				System.out.println(((service.login(id, s.next()) != null)
						? service.update(id, s.next(), s.nextInt(), s.next()) : "회원 정보가 일치하지 않습니다."));

				break;
			case 5:
				System.out.println("탈퇴하실 아이디와 비밀번호를 입력하세요");
				id = s.next();
				System.out.println(((service.login(id, s.next()) != null) ? service.remove(id) : "회원 정보가 일치하지 않습니다."));
				break;
			case 0:
				System.out.println("시스템 종료");
				return; 
			default:
				return;
			}

		}
	}
}
