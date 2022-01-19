import java.util.Scanner;

public class Simpleinterestcalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int p=s.nextInt(), r=s.nextInt(), t=s.nextInt();
		int SI= (p*r*t)/100;
		System.out.println(SI);

	}

}
