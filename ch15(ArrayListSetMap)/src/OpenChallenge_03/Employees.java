package OpenChallenge_03;

import java.time.LocalDate;
import java.util.Objects;
import java.util.TreeSet;

public class Employees implements Comparable<Employees>  {
	private int employeeId;
	private String employeeName;
	private String jobTitle;
	private LocalDate hireDate;
	
	public Employees(int employeeId, String employeeName, String jobTitle, LocalDate hireDate) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.jobTitle = jobTitle;
		this.hireDate = hireDate;
	}

	public int getEmployeeId() { return employeeId; }

	public String getEmployeeName() { return employeeName; }

	public String getJobTitle() { return jobTitle; }

	public LocalDate getHireDate() { return hireDate; }

	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", jobTitle=" + jobTitle
				+ ", hireDate=" + hireDate + "]";
	}

	@Override
	public int compareTo(Employees o) {
		GradeEnum thisPos = GradeEnum.valueOf(jobTitle);
		GradeEnum otherPos = GradeEnum.valueOf(o.getJobTitle());
	
		if (thisPos.compareTo(otherPos) > 0) return 1;	//enum객체는 compareTo메소드 쓸 수 있음.
		if (thisPos.compareTo(otherPos) < 0) return -1;
		if (hireDate.compareTo(o.getHireDate()) > 0) return 1;
		if (hireDate.compareTo(o.getHireDate()) < 0) return -1;
		return employeeName.compareTo(o.getEmployeeName());
	}
}

