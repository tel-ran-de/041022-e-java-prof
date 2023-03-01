package de.telrun.khakov.rustam.homework12;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Rustam Khakov
 */
public class UserService {
	Map<String, User> users = new HashMap<>();

	public void signIn(String email, String password) throws NoSuchAlgorithmException {
		User user = users.get(email);
		if (user == null) {
			System.out.println("нет такого пользователя");
			return;
		}
		byte[] originalPwd = user.getPassword();
		byte[] enteredPwd = createHash(password);
		if (Arrays.equals(originalPwd, enteredPwd)) {
			System.out.println("все ок");
		} else {
			System.out.println("password mismatch");
		}

	}

	private byte[] createHash(String pwd) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA1");
		return mDigest.digest(pwd.getBytes(StandardCharsets.UTF_8));
	}

	public void signUp(String email, String password) throws NoSuchAlgorithmException {
		User user = users.get(email);
		if (user != null) {
			System.out.println("пользователь существует с таким email");
			return;
		}
		// password.length >8
		// password ['x', 'X']
		// isUpper  = false;
		//for (Char c: chars)
		//boolean isUpper = isUpper || Character.isUpperCase(c) - текущая буква большая
		//Character.isLowerCase(c) - текущая буква меленькая
		//Character.isDigit(c) - текущий символ - это цифра
		//char[] specialChars =  "!@#$%^&*()_+".toCharArray();
		//specialChars.contains(c)

		byte[] pwd = createHash(password);
		users.put(email, new User(email, pwd));
	}
}
