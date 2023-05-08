import java.util.Scanner;
public class GameXoXo {
	static int number;
	public static void main(String args[]) {
		number=(int)(Math.random()*100);
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter number");
			int val=sc.nextInt();
			
			if(val<number) {
				System.out.println("number is greater than "+val);
			}
			else if(val>number) {
				System.out.println("number is less than "+val);
				
			}
			else {
				System.out.println("Game over");
				break;
			}
		}
	}

}
