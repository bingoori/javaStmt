package ifelse;

public class Gender {
	private String name, ssn, result;

	public Gender(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}


	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getResult() {
		char flag = ssn.charAt(7);
		if(flag == '1' || flag == '3')
		{
			result = "남자";
		}else if(flag == '2' || flag == '4')
		{
			result = "여자";
		}else if(flag == '5' || flag == '6')
		{
			result = "외쿸인";
		}
		return result;
	}



}
