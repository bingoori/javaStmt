package forloop;

public class MaxMin {

	private int max, min;

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void result(int[] ave) {
		this.max = ave[0];
		this.min = ave[0];
		for (int i = 0; i < ave.length; i++) {
			if (this.max < ave[i]) {
				this.max = ave[i];
			}
			if (this.min > ave[i]) {
				this.min = ave[i];
			}
		}

	}
}
