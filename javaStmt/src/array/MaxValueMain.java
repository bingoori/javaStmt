package array;

/**
 * @package : array
 * @file : MaxValueMain.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 14.
 * @story 배열의 요소 중 가장 큰 값 출력
 */
public class MaxValueMain {

	public static void main(String[] args) {
		int[] arr = { 32, 26, 76, 44, 66, 30 };
		MaxValue mv = new MaxValue();
		mv.setMax(arr);
		System.out.println("배열 중 가장 큰 값은 " + mv.getMax() + " 입니다");
	}

}

