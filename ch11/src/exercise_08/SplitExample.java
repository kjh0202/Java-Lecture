package exercise_08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		//방법1 (split() 메소드 이용)
		String str = "아이디,이름,패스워드";
		String[] names = str.split(",");
		
		for(String name : names) {
			System.out.println(name);
		}
			
		System.out.println();
		
		//방법2 (StringTokenizer 이용)
		StringTokenizer st = new StringTokenizer(str, ",");
		while( st.hasMoreTokens() ) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
