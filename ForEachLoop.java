
public class ForEachLoop {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};//no indexing required
		for(int i:a) {
			System.out.println(i);
		}
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		System.out.println("Sum of array elements="+sum);
	}

}
