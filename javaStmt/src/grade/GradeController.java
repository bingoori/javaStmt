package grade;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeServiceImpl Service = new GradeServiceImpl();
		// 메서드 내부이므로 지역변수이고 지역변수 이므로 초기화해도 문법상 문제가 없다.

		while (true) {
			System.out.println("[메뉴] 1.등록 2.수정 3.삭제 4.조회(전체) 5.조회(이름) 6.조회(학번) 7.회원수  0.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("학번,이름,JAVA,SQL,JSP,Spring");
				Service.input(new GradeBean(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt(), scanner.nextInt()));
				break;
			case 2:
				System.out.println("수정하는 성적의 학번,java,sql,jsp,spring 점수를 입력하시오");
				int hak = scanner.nextInt();
				String name = Service.getGradeByHak(hak).getName();
				System.out.println(Service.update(hak, name, scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt()));
				// Service.update(Service.getGradeByHak(scanner.nextInt()));
				break;
			case 3:

				System.out.println("삭제하실 학번을 입력하세요");
				System.out.println(Service.delete(scanner.nextInt()));
				System.out.println("삭제 완료 되었습니다.");
				break;
			case 4:
				System.out.println("전체 목록을 출력합니다.");
				System.out.println(Service.getList());
				break;
			case 5:
				System.out.println("조회할 이름을 입력하세요.");
				ArrayList<GradeBean> tempList = Service.getGradesByName(scanner.next());
				System.out.println((tempList == null) ? "조회하려는 이름이 없습니다" : tempList.toString());
				break;
			case 6:
				System.out.println("조회 하려는 학번을 입력하세요");
				GradeBean temp = Service.getGradeByHak(scanner.nextInt());
				System.out.println((temp == null) ? "조회하려는 학번이 없습니다" : temp.toString());
				break;
			case 7:
				System.out.println(Service.getCount() + " 명");
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
