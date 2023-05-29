
public class Constructors {
    String employeeName;
    String employeeAddress;
    public Constructors() {
    	employeeName="abc";
    	employeeAddress="jbp";
    }
    public Constructors(String n,String a)
    {
      employeeName=n;
      employeeAddress=a;
    }
    public void getDetails() {
    	System.out.println("Name of the employee: "+employeeName);
    	System.out.println("Address:"+employeeAddress);
    }
	public static void main(String[] args) {
       Constructors c1= new Constructors();
       c1.getDetails();
       c1.employeeName="a";
       c1.employeeAddress="b";
       c1.getDetails();
       
       Constructors c2= new Constructors();
       c2.getDetails();

       Constructors c3= new Constructors("ss","indore");
       c3.getDetails();
       c1.getDetails();

	}

}
