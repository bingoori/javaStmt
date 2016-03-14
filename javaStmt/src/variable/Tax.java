package variable;

public class Tax {
private String name;
private int sal;
private double result;


public double getResult() {
	return result;
}
public void setResult( ) {
	this.result = (int)(sal*0.1)/12;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}


}
