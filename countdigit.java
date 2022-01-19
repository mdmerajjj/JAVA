import java.util.Scanner;
public class countdigit {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int dig=0	;
	while (n!=0) {
		n=n/10;
		dig++;
	}
System.out.println(dig);
	}

}
