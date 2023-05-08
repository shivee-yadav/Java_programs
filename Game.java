import java.util.Scanner;
public class Game {
	static void sop(String s) {//a function to write print statement in a short way
		System.out.println(s);
	}
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);//System-->class,in--->input(system se jo bhi input aaega wo scanner read krega
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Age:");
		int age=sc.nextInt();
		System.out.println("Enter salary:");
		double sal=sc.nextDouble();
		sop("Details:");
		sop("Name :"+name);
		sop("Age :"+age);
		sop("Sal :"+sal);
		
		System.out.println("a");
		System.out.println('a');
		System.out.println(5);
		System.out.println(5.5);
		System.out.println(true);
		
		
	}

}
