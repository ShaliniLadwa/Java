import java.util.Scanner;

public class MessageDecoderApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String ch=scan.next();
	MessageDecoder decoder = new MessageDecoder();
	System.out.println(MessageDecoder.decodeCharacter('A'));
}
}
