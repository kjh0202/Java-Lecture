package OpenChallenge_01;

import java.util.Scanner;

public class MemberExample {

	 public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Login ID: "); 
        String ids = scanner.nextLine();
        System.out.print("Password: ");
        String pws = scanner.nextLine();
        scanner.close();
        try {
        	if(checkLoginPassword(ids, pws))  
        			System.out.println("로그인 성공");
        } catch (InvalidLoginIdException | IncorectPasswordException e) {
        		System.out.println(e.getMessage());
        }
	 }

 	static boolean checkLoginPassword(String ids, String pws) 
 			throws InvalidLoginIdException,IncorectPasswordException {
 		
        String[] loginIds = { "abcde", "fghij", "klmno", "pqrst", "uvwxyz" };
        String[] passwords  = { "abcde12", "fghij12", "klmno12", "pqrst12", "uvwxyz12" };
        
    	int index = -1;        
 		for(int i=0; i<loginIds.length; i++) {
			if ( loginIds[i].equals(ids)) {
				index = i;
				break;
			}
 		}
 		
		if (index < 0)
			throw new InvalidLoginIdException("로그인 아이디가 없습니다.");
		if (passwords[index].equals(pws))
			return true;
		else 
			throw new IncorectPasswordException("패스워드를 잘못 입력하였습니다.");
		
 	} 
}
