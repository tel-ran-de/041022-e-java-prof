package de.telrun.khakov.rustam.claswork12;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class PasswordHash {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA1");
		byte[] result = mDigest.digest("Testoppa".getBytes(StandardCharsets.UTF_8));
		byte[] resultFromUser = mDigest.digest("Testoppa".getBytes(StandardCharsets.UTF_8));
		System.out.println(Arrays.equals(result, resultFromUser));
	}
}
