package basic03;

public class EaglesDTO {
	
	private int backNo;
	private String name;
	private String position;
	private String highSchool;
	private String throwHand;
	private String hitHand;
	private String birthYear;
	private String annualIncome;
	
	public EaglesDTO(int backNo, String name, String position, String highSchool, String throwHand, String hitHand,
			String birthYear, String annualIncome) {
		this.backNo = backNo;
		this.name = name;
		this.position = position;
		this.highSchool = highSchool;
		this.throwHand = throwHand;
		this.hitHand = hitHand;
		this.birthYear = birthYear;
		this.annualIncome = annualIncome;
	}

	public EaglesDTO() {
		
	}

	public int getBackNo() {
		return backNo;
	}

	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHighSchool() {
		return highSchool;
	}

	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}

	public String getThrowHand() {
		return throwHand;
	}

	public void setThrowHand(String throwHand) {
		this.throwHand = throwHand;
	}

	public String getHitHand() {
		return hitHand;
	}

	public void setHitHand(String hitHand) {
		this.hitHand = hitHand;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	@Override
	public String toString() {
		return "EaglesDTO [backNo=" + backNo + ", name=" + name + ", position=" + position + ", highSchool=" + highSchool
				+ ", throwHand=" + throwHand + ", hitHand=" + hitHand + ", birthYear=" + birthYear + ", annualIncome=" + annualIncome + "(천원)]";
						
	} 

}
