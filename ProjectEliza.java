import java.util.Scanner;
public class ProjectEliza {

	public static void main(String[] args) {
		String user;
		String userSentence;
		String yesOrNo;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("ELIZA:    Hello, my name is Eliza. What is your name?");
		System.out.print("User:     ");
		user = scanner.next();
		
		
		System.out.println("ELIZA:    Hello, " + user + ". Tell me what is on your mind today in 1 sentence.");
		System.out.print("User:     ");
		
		
		while (true) {
		
		userSentence = scanner.next();
		String[] str = userSentence.split(" ");
		String[] Words = {str[0], str[str.length - 1]};
		
	
	
		
			
			
		if (userSentence.equals("EXIT")) {
			
		System.out.println("ELIZA: Do you want to run the session again?");
		System.out.print("User: ");
		yesOrNo = scanner.next(); 
		
		
	
		if (yesOrNo.equals("Yes")) {
			
		}
		else  {
		
		     System.out.println("Goodbye, until next time"); 
		}
		    
		     }
		
		}}
	
	}
	
}
