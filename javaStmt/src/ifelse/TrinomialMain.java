package ifelse;

import java.util.Scanner;

public class TrinomialMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름,국어,영어,수학 점수 입력");
		String name = scanner.next();
		Trinomial t = new Trinomial(scanner.next() ,scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		System.out.println(t.toString());

	}
}
