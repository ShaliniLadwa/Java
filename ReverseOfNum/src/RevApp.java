import java.util.Scanner;

public class RevApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	Rev rev = new Rev();
	int re=rev.revNum(n);
	System.out.println(re);
}
}
