package exam14;

public class Student extends Person {

	private int id;
	private String name;
	private int score;
	
	public void Person(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person compareKey = (Person) obj;
			if((this.id == this.id && this.name == this.name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return hashCode();
	}
}
