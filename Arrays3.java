
public class Arrays3 {
	public static void main(String args[]) {
		int n=5;
		int arr[]=new int[5];
		
		int arr2[][]=new int[2][];
		arr2[0]=new int[3];
		arr2[1]=new int[2];
		arr2[0][0]=10;
		arr2[0][1]=20;
		arr2[0][2]=30;
		
		arr2[1][0]=40;
		arr2[1][1]=50;
		
		//or
		
		int arr3[][]= {{10,20,30},{40,50}};
		
		
		System.out.println(arr3.length);//2
		System.out.println(arr3[0].length);//3
		System.out.println(arr3[1].length);//2
		
		int[] x;
		x=new int[3];
		//x= {1,2,3};-->Illegal start of expression cuz you've merged 2 concepts
		//length()-->function of string class
		//length-->property of array
		
		//anonymous arrays
		System.out.println(sum(new int[] {1,2,3,4,5}));//instant array being sent to sum function
		
		
	}
	   static int  sum(int[] arr) {
		int total=0;
		for(int i:arr) {
			total += i;
			
		}
		return total;
	}

}
