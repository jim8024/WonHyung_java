package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * JDBC java database connectivity
 * 
 * database에 연결해서 select insert delete update 작업하기
 * 
 * oracle에 연결하기 위해서는 드라이버 클래스가 들어있는 jar파일을 사용할 수 있어야 한다
 * 
 * 프로젝트에 마우스 우클릭 build path=>configure build path =>library 탭 선택
 * =>class path 선택 우측 add external jar 누른후 apply
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		   //DB 연결객체를 담을 지역 변수 만들기
	      Connection conn=null;
	      
	      try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      //select 작업을 위해서 필요한 객체의 참조값을 담을 지역 변수 미리 만들기
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try {
	    	  //실행할 sql문
	    	  String sql="SELECT num,name,addr"
	    			  +" FROM member"//띄어쓰기 해주기
	    			  +" Order By num DESC";
	    	  //prepared statemment 객체의 참조값 얻어오기
	    	  pstmt=conn.prepareStatement(sql);
	    	  //Select 문 실행하고 결과 값을 Result set으로 얻어오기
	    	  rs=pstmt.executeQuery();
	    	  while(rs.next()) {  //커서를 내림(커서 다음 데이터가 있는지 물어봄)
	    		  int num=rs.getInt("num");   //숫자 읽기
	    		  String name=rs.getString("name");  // 문자 읽기
	    		  String addr=rs.getString("addr");
	    		  //콘솔창에 출력해보기
	    		  System.out.println(num+" | "+name+" | "+addr);
	    	  }
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	     }
	}

