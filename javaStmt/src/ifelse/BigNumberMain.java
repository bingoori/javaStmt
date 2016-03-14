package ifelse;

import java.util.Scanner;

/**
 * @package : ifelse
 * @file : BigNumber.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 입력된 3개 숫자에서 가장 큰 수
 */
public class BigNumberMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3개의 숫자를 입력하세요");
		BigNumber bn = new BigNumber();
		bn.setBig(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		System.out.println("가장 큰 수는"+bn.getBig()+" 입니다");
	}
}
