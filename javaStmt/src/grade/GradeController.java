package grade;

import java.util.Scanner;

public class GradeController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeServiceImpl Service = new GradeServiceImpl();
		//메서드 내부이므로 지역변수이고 지역변수 이므로 초기화해도 문법상 문제가 없다.

		System.out.println("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체) 5.조회(이름) 6.조회(학번) 7.회원수  0.종료");
		while (true) {
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("학번,이름,JAVA,SQL,JSP,Spring");
				Service.input(new GradeBean(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
				
				break;
			case 2:
				Service.update();
				break;
			case 3:
				Service.delete();
				break;
			case 4:
				System.out.println(Service.getList());
				break;
			case 5:
				Service.getGradesByName();
				break;
			case 6:
				Service.getGradeByHak();
				break;
			case 7:
				Service.getCount();
				break;
			case 0:
				System.out.println("종료");
				return;
			default:
				System.out.println("잘못된 값 입니다");
				return;
			}
		}

	}
}
