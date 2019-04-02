package basic01;

import java.sql.*;

public class DeletMain {

	public static void main(String[] args) {
	    Connection conn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");	
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
                "javauser", "javapass");	
        	// the mysql update statement
            String query = "delete from song where _id=?;";
            
            //create the mysql delete preparedStatement
            PreparedStatement pStmt = conn.prepareStatement(query);
            pStmt.setInt(1, 118);
            
            // execute the preparedStatement
            pStmt.executeUpdate();
            
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