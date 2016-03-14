package ifelse;

import java.util.Scanner;

/**
 * @package : ifelse
 * @file : TimeCalc.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 초를 입력하면 시간, 분, 초를 출력하는 프로그램 10000초를 입력하면 7시간 47분 13초를 출력 100초면 1분 40초
 */
public class TimeCalcMain {
	public static void main(String[] args) {
		int hour = 0, minute = 0, second = 0, time = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		TimeCalc tc = new TimeCalc(scanner.nextInt());
		// 200 3분 20초
		// 400 6분 40초
		// 800 13분 20초
		// 1000 16분 40초
		// 3000 50분
		// 3500 58분 20초
		// 3600 60분
		// 4500 1시간15분


		System.out.println(tc.getHour() + "시" + tc.getMinute() + "분" + tc.getSecond() + "초");
	}
}
