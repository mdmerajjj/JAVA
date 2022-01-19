package IF_else;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		if (k%2==0) {
			System.out.println(k + " Number is Even.");
		}
		else {
			System.out.println(k + " Number is Odd.");
		}
	}}
