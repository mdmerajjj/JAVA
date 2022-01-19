import java.util.Scanner;
public class primetillN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
        int h=s.nextInt();
       
        for (int i=l; i<=h; i++) {
        	 int count=0;
        	for (int div=2; div*div<=i; div++) {
        	if (i%div==0) {
        		count++;
        		break;
        	}
        	}
        	if (count==0) {
        		System.out.println(i);
                  }
	           }
	         }
           }
