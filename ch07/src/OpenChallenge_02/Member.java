package OpenChallenge_02;

public class Member extends Customer{
	public int number;
	public int point;
	
	public Member(String name, String tel, String address, int number, int point) {
		super(name, tel, address);
		this.number = number;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", tel=" + tel + ", address=" + address + " + number=" + number + " + point=" + point+"]";
	}
	
	
}
