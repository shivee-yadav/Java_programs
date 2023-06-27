
public class Test5 {
	//static Double d;//NPE
	static Double d=10.5555;//no errors
	static int i=d.intValue();
	public static void main(String arg[]) {
		System.out.println("HELLO "+i+" "+d);
	}

}
