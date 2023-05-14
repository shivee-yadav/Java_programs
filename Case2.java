
public class Case2 {
	public void methodOne(int i) {
		System.out.println("int-arg");
	}
	
	public void methodOne(int... i) {//var-arg will get less priority i.e. if no other method metched then only var-arg will get executed
		System.out.println("var-arg : "+i.length);
	}

	public static void main(String[] args) {
		Case2 c= new Case2();
		c.methodOne(0);
		c.methodOne(0,1,2);
		c.methodOne(10);
				

	}

}
