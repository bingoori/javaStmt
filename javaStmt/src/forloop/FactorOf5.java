package forloop;

public class FactorOf5 {
	private int endNum, count, sum;

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
		int inCount = 0,inSum=0;
		for (int i = 1; i <= endNum; i++) {
			if (i % 5 == 0) {
				inCount++;
				inSum += i;
			}

		}
		this.count =inCount;
		this.sum = inSum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int inCount) {
		this.count = inCount;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "[결과] = [정수 1에서 " + getEndNum() + "까지 " + " 5배수의 갯수는 "+getCount()+"개 5배수의 합은 "+getSum()+"입니다]";
	}

}
