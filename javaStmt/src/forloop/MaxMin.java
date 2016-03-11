package forloop;

import java.util.Scanner;

/**
 * @package : forloop
 * @file : MaxMin.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 최고점,최저점 구하기 [결과] 학생들의 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다. 단 정원은 5명 입니다. 평균
 *        점수를 입력하세요 최고점은 100점이고, 최저점은 30점 입니다.
 */
public class MaxMin {
	public static void main(String[] args) {

		System.out.println("학생들의 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다" + "단 정원은 5명 입니다" + "평균 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int max = 0, min = 100;
		int[] ave = new int[5];

		for (int i = 0; i < ave.length; i++) {
			ave[i] = scanner.nextInt();

			if (max < ave[i]) {
				max = ave[i];
			}
			if (min > ave[i]) {
				min = ave[i];
			}

		}
		System.out.println("최고점은 " + max + "점이고, 최저점은 " + min + "점 입니다.");
	}
}
