package switchcase;

public class Pass {
	private String name = "", pass = "";
	private int java, jsp, sql, spring, total;
	private double ave;

	public Pass(String name, int java, int jsp, int sql, int spring) {
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.sql = sql;
		this.spring = spring;
		this.total = (java+jsp+sql+spring);
		this.ave = (int) total / 4;
		
	}

	public String getName() {
		return name;
	}



	public void setPass() {
		switch (total) {
		
		default:
			if(ave > 59.9)
			{
				pass = "합격";
			}else
			{
				pass = "불합격";
			}
			System.out.println("학생\tJAVA\tJSP\tSQL\tSPRING\t총점\t평균\t합격여부");
			System.out.println("--------------------------------------------------------------");
			System.out.println(name+"\t"+java+"\t"+jsp+"\t"+sql+"\t"+sql+"\t"+total+"\t"+ave+"\t"+pass);
			return;
		}
	}

	public String getPass() {
		return pass;
	}

	public int getJava() {
		return java;
	}

	public int getJsp() {
		return jsp;
	}

	public int getSql() {
		return sql;
	}

	public int getSpring() {
		return spring;
	}

	public int getTotal() {
		return total;
	}

	public double getAve() {
		return ave;
	}

}
