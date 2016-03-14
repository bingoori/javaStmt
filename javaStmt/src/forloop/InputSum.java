package forloop;

public class InputSum {
	private int input, sum;

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		int inSum = 0;
		for (int i = 1; i <= input; i++) {
			inSum += i;
		}
		this.sum = inSum;
	}

	public int getSum() {
		return sum;
	}

}
