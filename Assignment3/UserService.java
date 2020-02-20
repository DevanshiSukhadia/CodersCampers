import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class UserService {
	
	public User createUser (String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}
}
