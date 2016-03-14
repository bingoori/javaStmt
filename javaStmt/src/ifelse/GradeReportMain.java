package ifelse;

import java.util.Scanner;

/**
 * @package : ifelse
 * @file : GradeReport.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 성적표(점수에 따라 A ~ F까지 학점부여) [결과]
 ***********************************
 *        이름 영어 점수 학점 ---------------------------- 홍길동 eng 89점 B
 *        ********************************* 90점 이상 A 80점 이상 B 70점 이상 C 60점 이상 D
 *        50점 이상 E 50점 미만 F 만약, 입력한 점수가 100점 초과한다든지 0점 미만이면 잔못 입력했습니다 라고 메시지를
 *        출력한다
 */
public class GradeReportMain {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과과목과점수를 입력하세요");
		GradeReport gr = new GradeReport(scanner.next(), scanner.next(), scanner.nextInt());
		gr.setScore2();
		System.out.println("이름\t영어\t점수\t학점\t");
		System.out.println("---------------------------");
		System.out.println(gr.getName() + "\t" + gr.getSubject() + "\t" + gr.getScore1() + "\t" + gr.getScore2() + "\t");
	}
}
