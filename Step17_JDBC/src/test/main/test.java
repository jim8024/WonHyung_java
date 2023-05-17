package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class test {
	public static void main(String[] args) {
	      Connection conn=null;	
	      try {	   
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	      
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	      
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	        
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try {
	    	  String sql="SELECT empno,ename,deptno,job"
	    			  +" FROM emp"//
	    			  +" Order By empno ASC";
	    	  pstmt=conn.prepareStatement(sql);
	    	  
	    	  rs=pstmt.executeQuery();
	    	  while(rs.next()) {  
	    		  int empno=rs.getInt("empno");   
	    		  String ename=rs.getString("ename");
	    		  int deptno=rs.getInt("deptno");
	    		  String job=rs.getString("job");
	    		  
	    		  System.out.println(empno+" | "+ename+" | "+deptno+" | "+job);
	    	  }
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	     }
	}

