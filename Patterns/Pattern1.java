package Patterns;
import java.util.Scanner;
public class Pattern1 {
	
	public static void main(String[]arg) {
Scanner s= new Scanner(System.in);
 int n = s.nextInt();
 int i=0; 
 int val;
while (i<=n){
	if(i%2==0) {
		val=0;
	}else {
		val=1;
	}
	int j=0;
	while (j<=i) {
		
		System.out.print(val);
		val=1-val;
		j=j+1;
	}
	System.out.println();
	i=i+1;
}
}
}