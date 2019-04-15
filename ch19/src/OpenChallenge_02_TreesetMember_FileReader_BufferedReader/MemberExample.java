package OpenChallenge_02_TreesetMember_FileReader_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class MemberExample {
	public static void main(String[] args) throws Exception {
		TreeSet<Member> memberSet = new TreeSet<Member>();
		FileReader fr = new FileReader("c:/Temp/addrInput.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = null;
	
		while((line = br.readLine()) != null) {
			System.out.println(line);
			StringTokenizer st = new StringTokenizer(line, ",");
			//int countTokens = st.countTokens();
			String name = st.nextToken();
			String email = st.nextToken();
			String tel = st.nextToken();
			Member member = new Member(name, email, tel);
			memberSet.add(member);
		}
		for (Member member: memberSet)	
			System.out.println(member.toString());
	}
}
