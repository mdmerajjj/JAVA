package IF_else;
import java.util.Scanner;
public class Largest_of_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int L=s.nextInt();
		int M=s.nextInt();
		if (k<=L && k<=M) {
			System.out.println(k +" is smaller.");
		}
		else if (L<=k && L<=M) {
				System.out.println(L +" is smaller.");
			}
			else {
				System.out.println(M + " is smaller.");
				
			}
		}
	}

