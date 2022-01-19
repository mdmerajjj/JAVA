import java.util.Scanner;
public class rotateby2 {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int temp = n;
		int nod = 0;
		while (temp>0) {
			temp = temp/10;               // Rotate by n number 
			nod++;                         // ip - 547815 rotate by 3 op will be 815547
		}
		k = k % nod;
		if (k<0) {
			k = k + nod;
		}
		int div = 1;
		int mult =1;
		for (int i=1; i<=nod; i++) {
			if (i<=k) {
				div = div*10;
			}
			else {
				mult = mult*10;
			}
		}
           int q = n / div;
           int r = n % div;
           int rot = r * mult + q;
           System.out.println(rot);
              	}
               }