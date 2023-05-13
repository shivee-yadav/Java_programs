import java.util.Scanner;
public class Arrays2 {
	public static void main(String args[]) {
		int a[];
		int []b;
		int[] c;
		
		//int[10] d;invalid
		//two dimensional;
		int d[][];
		int[] [] e;
		int [] g [];
		int[] h[];
		
		int a1[],b1;//array,int
		
		int i=10;//i is a variable and int is data type
		Integer j=10;//j is an object of Integer class
		
		int z[]=new int[3];
		//Array object [I
		//invalid->int z[]=new int[];
		int z1[]=new int[0];//possible
		System.out.println(z1.length);
		//z1[0]=10;-->array index out of bound
		//int z3[]=new int[-3];//-->exception
		byte q=10;
		int z4[]=new int[q];
		
		short q1=10;
		int z5[]=new int[q1];
		
		char q2='a';
		int z6[]=new int[q2];
		
		boolean f=true;
		//invalid-->int z7[]=new int[f]; becuz boolean is true and false it is not a part of integer
		
		//float and double can't be used to initialize the size of an array
		
		//only byte ,short,char ,int
		
		//[2147483647]
		
		//Multidimensional-->array within an array
		
		int x[][]=new int[2][];//non-rectangular array or jagged array
		x[0]=new int[3];
		x[1]=new int[2];
		
		int x1[][]=new int[2][4];//rectangular array
		
		
		// 3 dimensional
		
		int[][][] r=new int[2][][];
		r[0]=new int[3][];
		r[0][0]=new int[5];
		r[1]=new int[2][];
		
		int x3[]=new int[3];
		System.out.println(x3);//[I@4517d9a3--->classname@hexadecimalstringrepresentationofhashcode
		System.out.println(x3.hashCode());//converting string hexadecimal hashcode into integer
		
		System.out.println(x1);//[[I@372f7a8d
		
		
		
		
		
	}
 
}
