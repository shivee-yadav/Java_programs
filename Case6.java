
public class Case6 {
	public void methodOne(String s) {
		System.out.println("string");
	}
	public void methodOne(StringBuffer s) {
		System.out.println("stringbuffer");
	}


	public static void main(String[] args) {
		Case6 c=new Case6();
		c.methodOne("arun");
		c.methodOne(new StringBuffer("sai"));
		//c.methodOne(null);->ambiguity
	}

}
