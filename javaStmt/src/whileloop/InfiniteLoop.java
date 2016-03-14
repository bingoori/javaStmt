package whileloop;

public class InfiniteLoop {
	private int result;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public void start(int key) {
		while (true) {
			switch (key) {
			case 1: 
				setResult(result);
				return; 
			case 2: System.out.println("종료 합니다.");
				return;

			default: System.out.println("잘못 된 값");
				return;
			}
		}
	}
}
