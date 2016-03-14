package switchcase;

public class Calc {
	private int mok, nmg, result,inputA,inputB;
	private String Opcode;

	public int getResult() {
		return result;
	}

	public int getInputA() {
		return inputA;
	}



	public int getInpuB() {
		return inputB;
	}



	public String getOpcode() {
		return Opcode;
	}

	public void setResult(int a, String opcode, int b) {
		this.inputA = a;
		this.inputB = b;
		this.Opcode = opcode;
		switch (opcode) {
		case "+":
			this.result = a + b;
			break;
		case "-":
			this.result = a - b;
			break;
		case "*":
			this.result = a * b;
			break;
		case "/":
			this.mok = a / b;
			this.nmg = a % b;
			return;
		default:
			return;
		}
	}

	public int getMok() {
		return mok;
	}


	public int getNmg() {
		return nmg;
	}


	@Override
	public String toString() {
		if(getOpcode().equals("/"))
		{
			return "[결과] = ["+getInputA()+" "+getOpcode()+" "+getInpuB()+" : 몫 "+getMok()+"나머지" + getNmg() +"]";
		}else
		{
			return "[결과] = ["+getInputA()+" "+getOpcode()+" "+getInpuB()+" = "+getResult() +"]";	
		}
	
	
	}

}
