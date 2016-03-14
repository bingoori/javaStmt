package ifelse;

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
		if (this.ave > 60) {
			this.pass = "합격";
		} else {
			this.pass = "불합격";
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
