package switchcase;

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
	return result;
}
	public void setResult() {
		char flag = ssn.charAt(7);
		switch (flag) {
		case '1':
		case '3':
			this.result = "남자";
			break;
		case '2':
		case '4':
			this.result = "여자";
			break;
		case '5':
		case '6':
			this.result = "외쿡인";
			break;
		default:
			System.out.println("잘못된 주민등록번호 입니다.");
			return;
		}
	}
}
