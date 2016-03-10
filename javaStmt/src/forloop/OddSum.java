package forloop;

public class OddSum {
public static void main(String[] args) {
	int sum = 0;
	int odd= 0;
	for (int i = 1; i <= 10; i++) {
		
			sum += i;
	
	}
	System.out.println(sum);
	
	for (int i = 1; i <= 10; i++) {
		if(i % 2 != 1)
		{
		odd += i;
		}

}
System.out.println(sum);
System.out.println(odd);
}
}
