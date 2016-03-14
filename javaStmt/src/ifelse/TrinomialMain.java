package ifelse;

import java.util.Scanner;

public class TrinomialMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름,국어,영어,수학 점수 입력");
		String name = scanner.next();
		
		int kor = scanner.nextInt(), eng = scanner.nextInt(), math = scanner.nextInt(), avg = 0;
		Trinomial t = new Trinomial(name ,kor, eng, math);
		System.out.println(t.toString());

	}
}
