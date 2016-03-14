package array;

public class MaxMin {
	private	int max,min;

	public void setMaxMix(int[] arr) {
	max = arr[0];
	min = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] > max)
		{
			max = arr[i];
		}
		if(arr[i] < min)
		{
			min = arr[i];
		}
	}
	}




	@Override
	public String toString() {
		return "1등,꼴등의 점수 [최대값=" + max + ", 최소값=" + min + "]";
	}
}
