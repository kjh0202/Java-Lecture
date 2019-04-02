package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dateTable {
	   public static void main(String[] args) {
	        Connection conn = null;
	        Statement st = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");	
	            conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
	                "javauser", "javapass");	
	            				
	            st = conn.createStatement();
	            
	            String sql = "select * from date_table;";
	            ResultSet rs = st.executeQuery(sql);
	            while (rs.next()) {
	                int id = rs.getInt(1);
	                String datetime = rs.getString(2);
	                System.out.printf("%8d %s\n", id, datetime);
	            }
	            System.out.println();
	            
	            sql = "select id, date_format(datetime, '%Y-%m-%d %r') from date_table";
	            rs = st.executeQuery(sql);
	            while (rs.next()) {
	                int id = rs.getInt(1);
	                String datetime = rs.getString(2);
	                System.out.printf("%8d %s\n", id, datetime);
	            }
	            rs.close();
	            st.close();
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