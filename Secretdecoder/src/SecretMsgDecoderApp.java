import java.util.Scanner;

public class SecretMsgDecoderApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Character");
		char ch = scan.next().charAt(0);
		SecretMsgDecoder secretMsgDecoder = new SecretMsgDecoder();
		System.out.println(secretMsgDecoder.decodeCharacter(ch));
		
	}

}