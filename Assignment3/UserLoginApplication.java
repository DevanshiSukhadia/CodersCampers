import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		
		UserService userService = new UserService();
		
		User[] user = new User[4];
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(System.in);
			
			boolean validLogin = false;
			
			int loginAttempts = 0;
			
			while(!validLogin && loginAttempts < 5) {
				System.out.println("Enter your email: ");
				String username = scanner.nextLine();
				System.out.println("Enter your password: ");
				String password = scanner.nextLine();
				
			}
			
		} finally {
			
		}
		
		
		BufferedReader filereader = null;
		String line;
		
		try {
			filereader = new BufferedReader(new FileReader("data.txt"));
			try {
				while ((line = filereader.readLine()) != null) {
					
				
					System.out.println(line);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
			
	}

}
