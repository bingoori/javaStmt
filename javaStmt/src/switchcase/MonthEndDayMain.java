package switchcase;

import java.util.Scanner;
import ifelse.LeafYear;
/**
 * @package : switchcase
 * @file : MonthEndDay.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 해당 월의 말일 출력함 예를 들면 1월이면 31일 출력
 */
public class MonthEndDayMain {
	public static void main(String[] args) {
		LeafYear leaf = new LeafYear();
		Scanner scanner = new Scanner(System.in);
		System.out.println("년 월 입력");
		int year = scanner.nextInt();
		String years = leaf.getYear(year);
		
		MonthEndDay med = new MonthEndDay();
		med.setMonth(scanner.nextInt());
		
		

		System.out.println(year +"년 "+med.getMonth()+"월 "+med.getEndDay()+"일이 말일 입니다.");
		
	}
}
