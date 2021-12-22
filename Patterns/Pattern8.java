package Patterns;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);  //print 1 to 7
		int n=s.nextInt();
		for (int y=-2; y<=n; y+=2)
		System.out.println(y);

	}

}
