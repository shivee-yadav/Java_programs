
public class Case4 {
	public void methodOne(int i,float f) {
		System.out.println("int-float");
	}
	public void methodOne(float f,int i) {
		System.out.println("float-int");
	}
	public static void main(String args[]) {
		Case4 c= new Case4();
		c.methodOne(10,20.5f);
		c.methodOne(10.5f,20);
		//c.methodOne(10, 10);->compilation error bcuz of ambiguity

	}

}
