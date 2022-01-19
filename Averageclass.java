import java.util.Scanner;
public class Averageclass {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String p=s.nextLine();
		int i=s.nextInt();
		int j=s.nextInt();
		int k=s.nextInt();
		int avg=(i+j+k)/3;
		System.out.println(p+avg);
	}

}
