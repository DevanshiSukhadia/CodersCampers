import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class UserService {
	
	public User validateUser(String username, String password) {
		for(User users : UserLoginApplication.user) {
			if(users.getUsername().equalsIgnoreCase(username) && users.getPassword().equals(password)) {
				return users;
			}
		}
		return null;
	}
}
