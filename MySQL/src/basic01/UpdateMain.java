package basic01;

import java.sql.*;

public class UpdateMain {

	public static void main(String[] args) {
	    Connection conn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");	
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
                "javauser", "javapass");	
        	// the mysql update statement
            String query = "update song set lyrics=? where _id=?";
            
            //create the mysql update preparedStatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, "왜 예쁜 날 두고 가시나 (날 두고 가시나)");
            preparedStmt.setInt(2, 117);
           
            // execute the preparedStatement
            preparedStmt.executeUpdate();
            
            conn.close();
        } catch (Exception ex) {
           ex.printStackTrace();
        } finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException se2) { }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}