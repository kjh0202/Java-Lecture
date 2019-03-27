package sec11_08_StringTokenizer;

import java.util.StringTokenizer;

public class Pathenv {

	public static void main(String[] args) {
		String path = System.getenv("PATH");
		System.out.println("PATH:" + path);
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(path, ";");
		
		while (st.hasMoreTokens()) {
			//String token = st.nextToken();
			System.out.println(st.nextToken());
		}
	}

}
