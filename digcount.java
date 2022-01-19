import java.util.Scanner;
import java.util.Scanner;
public class digcount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem=0;
	while (n != 0) {
		n = n/10;  //same value is assigning in n-varriable after devided by 10.
		rem++; 
	}
		System.out.println(rem);
	}
}
