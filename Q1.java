
public class Q1 {
	static int count=0;
	int i=0;
	public void changeCount() {
		while(i<5) {
			i++;
			count++;
		}
	}
	public static void main(String args[]) {
		Q1 c1=new Q1();
		Q1 c2=new Q1();
		c1.changeCount();
		c2.changeCount();
		System.out.println(c1.count + " : "+ c2.count);//10:10
	}

}
