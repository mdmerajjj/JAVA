package Practice;
import java.util.Scanner;
public class forrevesion1 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	  int n= s.nextInt();
	   int k= s.nextInt();
	   int nod=0;
		   while(n!=0) {
			   n=n/10;
			   nod++;}
		   int div=1;
		   int mul=1;
		   for(int i=1; i<=nod; i++) {
			   if (i<k) {
				 div= div*10;
			   }else {
				   mul=mul*10;
			   }
		   int q=n/div;
			   int r=n%div;
		   int u= r*mul+q; 
	System.out.println(u);
		   }
	}
}
