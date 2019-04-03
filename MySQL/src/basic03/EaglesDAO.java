package basic03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import basic02.SongDTO;

public class EaglesDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world" + "?verifyServerCertificate=false&useSSL=false";

	public EaglesDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//selectOne
	public EaglesDTO selectOne(int backNo) {
		String query = "select * from Eagles where back_no=?;";
		PreparedStatement pStmt = null;
		EaglesDTO player = new EaglesDTO();
		  try {
			  	pStmt = conn.prepareStatement(query);
	            pStmt.setInt(1, backNo);
	            ResultSet rs = pStmt.executeQuery();
	            
	            while (rs.next()) {
	            	player.setBackNo(rs.getInt(1));	
	            	player.setName(rs.getString(2));
	            	player.setPosition(rs.getString(3));
	            	player.setHighSchool(rs.getString(4));
	            	player.setThrowHand(rs.getString(5));
	            	player.setHitHand(rs.getString(6));
	            	player.setBirthYear(rs.getString(7));
	            	player.setAnnualIncome(rs.getString(8));
	            }
	        } catch (Exception e) {
	           e.printStackTrace();
	        } finally {
	            try {
	                if (pStmt != null && !pStmt.isClosed())
	                	pStmt.close();
	            } catch (SQLException se) { 
	            	se.printStackTrace();
	            }
	            
            } 
		  	return player;
		  
	}
	
	//selectAll
	public List<EaglesDTO> selectCondition(String query) {
		//String query = "select * from Eagles;";
		PreparedStatement pStmt = null;
		List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
		  try {
			  	pStmt = conn.prepareStatement(query);
	            ResultSet rs = pStmt.executeQuery();
	            
	            while (rs.next()) {
	            	EaglesDTO player = new EaglesDTO();
	            	player.setBackNo(rs.getInt(1));	
	            	player.setName(rs.getString(2));
	            	player.setPosition(rs.getString(3));
	            	player.setHighSchool(rs.getString(4));
	            	player.setThrowHand(rs.getString(5));
	            	player.setHitHand(rs.getString(6));
	            	player.setBirthYear(rs.getString(7));
	            	player.setAnnualIncome(rs.getString(8));
	            	playerList.add(player);
	            }
	        } catch (Exception e) {
	           e.printStackTrace();
	        } finally {
	            try {
	                if (pStmt != null && !pStmt.isClosed())
	                	pStmt.close();
	            } catch (SQLException se) { 
	            	se.printStackTrace();
	            }
	            
            } 
		  	return playerList;
		  
	}
	
	public List<EaglesDTO> selectPlayersByPosition(String position) {
			String sql = "select * from Eagles where position like '" + position + "';";
			List<EaglesDTO> playerList = selectCondition(sql);
			return playerList;
	}
	
	public List<EaglesDTO> selectAll() {
		String sql = "select * from Eagles;";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	//selectPlayers2
		public List<EaglesDTO> selectPlayers2() {
			String query = "select * from Eagles where position like '외야수';";
			PreparedStatement pStmt = null;
			List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
			  try {
				  	pStmt = conn.prepareStatement(query);
		            ResultSet rs = pStmt.executeQuery();
		            
		            while (rs.next()) {
		            	EaglesDTO player = new EaglesDTO();
		            	player.setBackNo(rs.getInt(1));	
		            	player.setName(rs.getString(2));
		            	player.setPosition(rs.getString(3));
		            	player.setHighSchool(rs.getString(4));
		            	player.setThrowHand(rs.getString(5));
		            	player.setHitHand(rs.getString(6));
		            	player.setBirthYear(rs.getString(7));
		            	player.setAnnualIncome(rs.getString(8));
		            	playerList.add(player);
		            }
		        } catch (Exception e) {
		           e.printStackTrace();
		        } finally {
		            try {
		                if (pStmt != null && !pStmt.isClosed())
		                	pStmt.close();
		            } catch (SQLException se) { 
		            	se.printStackTrace();
		            }
		            
	            } 
			  	return playerList;
			  
		}
	
		//selectPlayersBySalary
		public List<EaglesDTO> selectPlayersBySalary(int annual_income) {
			String sql = "select * from Eagles where annual_income>=" + annual_income + ";";
			PreparedStatement pStmt = null;
			List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
			  try {
				  	pStmt = conn.prepareStatement(sql);
		            ResultSet rs = pStmt.executeQuery();
		            
		            while (rs.next()) {
		            	EaglesDTO player = new EaglesDTO();
		            	player.setBackNo(rs.getInt(1));	
		            	player.setName(rs.getString(2));
		            	player.setPosition(rs.getString(3));
		            	player.setHighSchool(rs.getString(4));
		            	player.setThrowHand(rs.getString(5));
		            	player.setHitHand(rs.getString(6));
		            	player.setBirthYear(rs.getString(7));
		            	player.setAnnualIncome(rs.getString(8));
		            	playerList.add(player);
		            }
		        } catch (Exception e) {
		           e.printStackTrace();
		        } finally {
		            try {
		                if (pStmt != null && !pStmt.isClosed())
		                	pStmt.close();
		            } catch (SQLException se) { 
		            	se.printStackTrace();
		            }
		            
	            } 
			  	return playerList;
			  
		}
		

		
	//insert
	public void insertPlayer(EaglesDTO player) {
		String query = "insert into Eagles values (?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement pStmt = null;
		  try {
			  	pStmt = conn.prepareStatement(query);
	            pStmt.setInt(1, player.getBackNo());
	            pStmt.setString(2, player.getName());
	            pStmt.setString(3, player.getPosition());
	            pStmt.setString(4, player.getHighSchool());
	            pStmt.setString(5, player.getThrowHand());
	            pStmt.setString(6, player.getHitHand());
	            pStmt.setString(7, player.getBirthYear());
	            pStmt.setString(8, player.getAnnualIncome());
	            
	            pStmt.executeUpdate();
	        } catch (Exception e) {
	           e.printStackTrace();
	        } finally {
	            try {
	                if (pStmt != null && !pStmt.isClosed())
	                	pStmt.close();
	            } catch (SQLException se) { 
	            	se.printStackTrace();
	            }
            }
	}	
	
	//update
	public void updatePlayer(EaglesDTO player) {
		String query = "update Eagles set name=?, position=?, high_school=?, throw_hand=?, hit_hand=?, birth_year=?, annual_income=? where back_no=?;";
		PreparedStatement pStmt = null;
		  try {
			  	pStmt = conn.prepareStatement(query);
	            pStmt.setString(1, player.getName());
	            pStmt.setString(2, player.getPosition());
	            pStmt.setString(3, player.getHighSchool());
	            pStmt.setString(4, player.getThrowHand());
	            pStmt.setString(5, player.getHitHand());
	            pStmt.setString(6, player.getBirthYear());
	            pStmt.setString(7, player.getAnnualIncome());
	            pStmt.setInt(8, player.getBackNo());
	            
	            pStmt.executeUpdate();
	        } catch (Exception e) {
	           e.printStackTrace();
	        } finally {
	            try {
	                if (pStmt != null && !pStmt.isClosed())
	                	pStmt.close();
	            } catch (SQLException se) { 
	            	se.printStackTrace();
	            }
	            
            } 
		}
	
	//delete
	public void deletePlayer(int Back_no) {
		String query = "delete from Eagles where back_no=?;";
		PreparedStatement pStmt = null;
		  try {
			  	pStmt = conn.prepareStatement(query);
	            pStmt.setInt(1, Back_no);
	            
	            
	            pStmt.executeUpdate();
	        } catch (Exception e) {
	           e.printStackTrace();
	        } finally {
	            try {
	                if (pStmt != null && !pStmt.isClosed())
	                	pStmt.close();
	            } catch (SQLException se) { 
	            	se.printStackTrace();
	            }
            }
	}	
	
	
	public void close() {
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
