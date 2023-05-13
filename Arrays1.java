
public class Arrays1 {
	public static void main(String args[]) {
		int arr1[]= {10,20,30,40,50};
		//or
		int arr2[];
		arr2=new int[4];
		arr2[0]=10;arr2[1]=20;arr2[2]=30;arr2[3]=40;
		
		
		System.out.println("Array size :"+arr1.length);
		
		//index 
		//print all the elements
		
		for(int index=0;index< arr1.length;index++) {
			System.out.println(arr1[index]);
		}
		//for each
		System.out.println("for each");
		for(int val:arr2) {
			System.out.println(val);
		}
		
		String arr3[]=new String[20];
		for(String val:arr3) {
			System.out.println(val);//default values
		}
		
		String arr4[]= {"unix","linux","windows"};
		for(String s:arr4) {
			System.out.println(s);
		}
		
		int sum=0;
		float avg=0.0f;
		for(int val:arr2) {
			sum+=val;
		}
		avg=sum/arr2.length;
		int sum1=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++)
			{
				sum1+=arr1[j];
			}
			System.out.print(sum1+" ");
			sum1=0;
		}
		System.out.println();
		
		String x="abcd";
		char data[]=x.toCharArray();
		for(int i=data.length-1;i>=0;i--) {
			System.out.print(data[i]);
			
		}
		
		
		}

}
