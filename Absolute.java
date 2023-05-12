import java.util.Scanner;
public class Absolute {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int rev=0,r=0,temp=num;
		while(temp>0) {
			r=temp%10;
			rev=rev*10+r;
			temp/=10;
		}
		System.out.println(Math.abs(num-rev));
	}
	

}
