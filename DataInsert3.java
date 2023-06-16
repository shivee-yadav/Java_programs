import java.sql.*;

public class DataInsert3 {

	public static void main(String[] args) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("Pass 1-driver");

			Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			// System.out.println("Pass 2-connection established");

			String sql = "select * from student";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println("Email :" + rs.getString(1) + "  Name:" + rs.getString(2));
			}
			rs.close();
			st.close();
			cn.close();

		} catch (Exception ex) {

		}

	}

}
