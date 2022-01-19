package Patterns;
import java.util.Scanner;
public class Pattern5 {
	  public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=1;
        for (int i=1; i<=n; i++) {
    	for (int j=1; j<=n; j++){
    		System.out.print(x);
    		}
    	System.out.println();
    	x++;
            }
          }
	    }