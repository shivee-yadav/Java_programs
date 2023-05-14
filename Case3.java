
public class Case3 {

	public void methodOne(String s) {
		System.out.println("String");
	}

	public void methodOne(Object o) {//if String function is not present then object func will get executed
		System.out.println("Object"+o);
	}

	public static void main(String[] args) {
		Case3 c = new Case3();
		c.methodOne("arun");
		c.methodOne(null);
		c.methodOne(new Object());//Objectjava.lang.Object@4517d9a3


	}

}
