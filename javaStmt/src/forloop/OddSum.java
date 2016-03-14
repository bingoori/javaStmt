package forloop;

/**
 *@file : OddSum.java
 *@author bingoori
 *@date 2016. 3. 10.
 *@story
 */
public class OddSum {
public static void main(String[] args) {
	
	int sum = 0;
	int odd= 0;
	for (int i = 1; i <= 10; i++) {
		
			sum += i;
	
	}
	
	for (int i = 1; i <= 10; i++) {
		if(i % 2 != 0)
		{
		odd += i;
		}

}
System.out.println(sum);
System.out.println(odd);
}
}
