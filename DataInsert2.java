import java.util.*;
import java.sql.*;

public class DataInsert2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email ");
		String email = sc.nextLine();

		System.out.println("Enter Name ");
		String name = sc.nextLine();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Pass 1-driver");

			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("Pass 2-connection established");

			String sql = "insert into student values(?,?)";
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1, email);
			st.setString(2, name);
			System.out.println(sql);
			
			st.execute();
			st.close();
			cn.close();
			System.out.println("Record saved successfully...");

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
