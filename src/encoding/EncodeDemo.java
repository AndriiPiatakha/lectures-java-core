package encoding;

import java.util.Base64;

public class EncodeDemo {
	
	public static void main(String[] args) {
		String originalInput = "q";
		String originalInput2 = "qq";
		String originalInput3 = "qa2";
		String originalInput4 = "qcas";
		String originalInput5 = "qrbrr";
		String originalInput6 = "qstrbr";
		String originalInput7 = "qas6tge";
		String originalInput8 = "qqas7reg";
		String originalInput9 = "qas8ergew";
		String originalInput10 = "qqas9";
		
		String encodedString = 
				  Base64.getEncoder().withoutPadding().encodeToString(originalInput.getBytes());
		String encodedString2 = 
				  Base64.getEncoder().withoutPadding().encodeToString(originalInput2.getBytes());
		String encodedString3 = 
				  Base64.getEncoder().withoutPadding().encodeToString(originalInput3.getBytes());
		String encodedString4 = 
				  Base64.getEncoder().withoutPadding().encodeToString(originalInput4.getBytes());
		String encodedString5 = 
				  Base64.getEncoder().withoutPadding().encodeToString(originalInput5.getBytes());
		String encodedString6 = 
				  Base64.getEncoder().withoutPadding().encodeToString(originalInput6.getBytes());
		String encodedString7 = 
				  Base64.getEncoder().withoutPadding().encodeToString(originalInput7.getBytes());
		String encodedString8 = 
				  Base64.getEncoder().withoutPadding().encodeToString(originalInput8.getBytes());
		
		
		
		System.out.println(encodedString);
		System.out.println(encodedString2);
		System.out.println(encodedString3);
		System.out.println(encodedString4);
		System.out.println(encodedString5);
		System.out.println(encodedString6);
		System.out.println(encodedString7);
		System.out.println(encodedString8);
		
		byte[] decodedBytes = Base64.getDecoder().decode("cXFhczdyZWc");
		String decodedString = new String(decodedBytes);
		
		System.out.println(decodedString);
	}

}
