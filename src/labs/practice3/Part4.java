package labs.practice3;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Cashing string values with encodings from package java.security.
 * 
 * Provides possibility to get hex representation of hash of the string.
 * 
 * @author Andrey Pyatakha
 *
 */

public class Part4 {
	
	/**
	 * Returns string of hex representation of byte array of hash algorithm.
	 * 
	 * Uses string format to formatting each byte to hex representation.
	 * 
	 * @param input text to receive hash.
	 * @param algorithm for hashing
	 * @return string with hex representation of hashing in specified algorithm.
	 * @throws NoSuchAlgorithmException
	 */
	
	public static String hash(String input, String algorithm) throws NoSuchAlgorithmException {

		MessageDigest digest = MessageDigest.getInstance(algorithm);
		digest.update(input.getBytes());
		byte[] hash = digest.digest();
		StringBuilder sb = new StringBuilder();
		for (byte b : hash) {
			sb.append(String.format("%02X, ", b));
		}
		
		return sb.toString();
	}
	

}
