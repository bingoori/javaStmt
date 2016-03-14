package forloop;

public class InputGugudan {
private int input;

public int getInput() {
	return input;
}

public void setInput(int input) {
	this.input = input;
	
	if (input <= 0) {
		System.out.println("정수값만 입력하시오");
		return; //아무값을 반환하지 않고 종료시킨다. --> 이메소드를 종료시켜라
	} 
	for(int i = 1; i <= 9 ; i++)
	{
		System.out.println(input+" * "+i+" = "+(input*i));
	}
}


}
