package ex_StudentScore;

public class StudentScore {
	private String name;
	private int math;
	private int eng;
	private int sci;
	private double avg;

	public StudentScore(String name, int math, int eng, int sci) {
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}

	@Override
	public String toString() {
		return "StudentScore [name=" + name + ", math=" + math + ", eng=" + eng + ", sci=" + sci + ", avg=" + avg + "]";
	}
	
	public double average() {
		int sum = this.math + this.eng + this.sci;
		double avg = (double)sum / 3;
		this.avg = avg;
		return avg;
	}
	
}
