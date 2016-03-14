package ifelse;

import java.util.Scanner;

/**
 * @package : ifelse
 * @file : Gender.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별 판별하는 로직
 */
public class GenderMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		System.out.println("주민번호를 입력하세요");
		Gender g = new Gender(scanner.next(), scanner.next());

		/**
		 * 800101 - 1234567
		 * 인덱스 0부터 시작
		 * 1, 3 이면 남자 if(flag = 1 || flag =3)
		 * 2, 4 이면 여자
		 * 5, 6 이면 외국인
		 * 다른 값이면 잘못된 주민번호 입니다.
		 * */
		System.out.println(g.getResult());
	}
}
