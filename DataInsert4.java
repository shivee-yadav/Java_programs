import java.sql.*;
import java.util.*;

public class DataInsert4 {
	public static void main(String args[]) {
		try {
			 Scanner sc = new Scanner(System.in);
		      System.out.println("Enter email");
		      String email = sc.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("Pass 1-driver");

			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			// System.out.println("Pass 2-connection established");

			String sql = "select * from student where email='"+email+"'";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			System.out.println("Name is " + rs.getString(2));
			rs.close();
			st.close();
			cn.close();

			

		} catch (Exception ex) {
			System.out.println("Email not found");

		}

		}
	}

