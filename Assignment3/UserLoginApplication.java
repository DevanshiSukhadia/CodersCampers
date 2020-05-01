import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static User[] user = new User[20];
	public static UserService userService = new UserService();

	public static void main(String[] args) throws FileNotFoundException, IOException{
		   BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader("data.txt"));
						String line = null;
						int i = 0;
						while ((line = br.readLine()) != null) {
						 
						  user[i] = new User(line.split(","));
						//  System.out.println(user[i]);
						  i++;
						} 
					}
						finally {
							if(br != null)
							      br.close();
						}

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
				
				User validUser = userService.validateUser(username, password);
				if (validUser != null) {
					System.out.println("Welcome: " + validUser.getName());
					validLogin = true;
				} else {
					System.out.println("Invalid login, please try again");
					loginAttempts++;
					if(loginAttempts >= 5) {
						System.out.println("Maximum 5 login attempts are allowed.");
					}
				}
			}
			
		} finally {
			scanner.close();
		}	
			
	}

}
