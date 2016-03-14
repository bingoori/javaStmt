package ifelse;

public class BigNumber {
	private int big;
	
	
	public int getBig() {
		return big;
	}


	public void setBig(int a,int b,int c){
		int inbig =a;
	
		if (b > inbig) {
			inbig = b;
		} 
		if(c > inbig){
			inbig = c;
		}
		this.big = inbig;
	}
}
