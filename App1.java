
public class App1 {
	public static void main(String args[]) {
		int a[]= {10,20,3,45,20};
		int min=a[0];
		int max=a[0];
		for(int i:a) {
			if(min<i) {
				min=i;
			}
			if(max>i) {
				max=i;
			}
		}
		System.out.println("Minimum element :"+min);
		System.out.println("Maximum element :"+max);
		
	}

}
