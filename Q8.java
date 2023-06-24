import java.util.Scanner;
public class Q8 {
	public static void main(String args[]) {
		/*String s="abcdabc";
		char c[]=s.toCharArray();
		
		for(char d:c) {*/
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		if(N>=1 && N<=500) {
			int a[]=new int[N];
			int b[]=new int[N-1];
			int c[]= new int[N-2];
			
			for(int i=0;i<N;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<N-1;i++) {
				b[i]=sc.nextInt();
			}
			for(int i=0;i<N-2;i++) {
				c[i]=sc.nextInt();
			}
			
			int sum1=0,sum2=0,sum3=0;
			for(int a1:a) {
				sum1 += a1;
							
			}
			for(int b1:b) {
				sum2 += b1;
			}
			
			for(int c1:c) {
				sum3 += c1;
			}
			
			System.out.println(sum1-sum2);
			System.out.println(sum2-sum3);
			
			
			
			
			
			
		}
		else
			System.out.println("Invalid");
			
		
	}
	

}
