package switchcase;

import java.util.Scanner;

/**
 * @package : ifelse
 * @file : Gender.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별 판별하는 로직
 */
public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		System.out.println("주민번호를 입력하세요");
		String name = scanner.next(),ssn = scanner.next(),result ="";
		char flag = ssn.charAt(7);
		
		/**
		 * 800101 - 1234567
		 * 인덱스 0부터 시작
		 * 1, 3 이면 남자 if(flag = 1 || flag =3)
		 * 2, 4 이면 여자
		 * 5, 6 이면 외국인
		 * 다른 값이면 잘못된 주민번호 입니다.
		 * */
		System.out.println("홍길동은 남자 입니다.");
		switch (flag) {
		case '1':
		case '3':
			result = "남자";
			break;
		case '2':
		case '4':
			result = "여자";
			break;
		case '5':
		case '6':
			result = "외쿡인";
			break;
		default:
			System.out.println("잘못된 주민등록번호 입니다.");
			return;
		}
		System.out.println(name+" 은 "+result+" 남자 입니다." );
	}
}
