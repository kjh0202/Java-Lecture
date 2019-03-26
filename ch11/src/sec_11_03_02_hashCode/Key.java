package sec_11_03_02_hashCode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {		//id가 동일한 문자열인 경우
		return number;			//같은 해시 코드를 리턴
	}
}
