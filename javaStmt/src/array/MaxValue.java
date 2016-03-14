package array;

public class MaxValue {
	private int max = 0;

	public void setMax(int[] arr) {
		this.max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
	}

	public int getMax() {
	
		return max;
	}
}
