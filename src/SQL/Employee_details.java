package SQL;

import java.sql.*;

public class Employee_details {

    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "root";
        
        String query = "select * from employee";

        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        
        while (rs.next()) {
            System.out.println(rs.getInt("emp_code") + " " + rs.getString("ename") + " " + rs.getInt("emp_age") + " " + rs.getInt("emp_sal"));
        }

        con.close();
    }
}
