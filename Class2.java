
public class Class2 {
	
	enum car {maruti,hundai,tata};
	public static void main(String args[]) {
		int num=2;//takes byte,short,int,char,string
		switch(num) {
		case 1:System.out.println("1");break;
		case 2:System.out.println("2");break;
		case 3:System.out.println("3");break;
		default:System.out.println("invalid input"); 
		
		}
		
		car c=car.tata;
		switch(c) {
		case maruti:System.out.println("maruti");break;
		case hundai:System.out.println("hundai");break;
		case tata:System.out.println("tata");break;
		default:System.out.println("invalid case");
		}
		
		
	}
	

}
