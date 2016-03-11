package forloop;

/**
 * @package : forloop
 * @file : Gugudan.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 11.
 * @story 2단 부터 9단까지 구구단 출력 단, 책받침 구구단으로 출력
 */
public class Gugudan {
	public static void main(String[] args) {
		for(int i = 1; i <=9; i++)
		{
			
			for(int j = 2; j <=9 ; j++)
			{
			System.out.print(j+" * "+i+" = "+(j*i)+"\t");	
			}
			System.out.println();
		}
	}
}
