package prac.jdbc.day01.statement;

import java.sql.*;

public class jdbcTest01_DDL {

	public static void main(String[] args) {
		
		Connection conn = null;
		// Connection conn 은 오라클데이터베이스 서버와 연결을 맺어주는 객체이다.
		
		Statement stmt = null;
		/*
			개발자가 SQL문(편지)를 작성했는데,
			작성한 SQL문을 어느 오라클서버에서 실행해야 할 지 결정해야 한다.
			이떄, 어느 오라클서버인지는 Connection conn에서 알고,
			Connection conn에 전송할 SQL문(편지)은 Statement stmt(우편배달부)를 통해 전송된다.
		 */
		
		// >>> 1. 오라클 드라이버 로딩 <<<
		/*
			=== OracleDriver(오라클 드라이버)의 역할 ===
			1) OracleDriver 를 메모리에 로딩시켜준다.
			2) OracleDriver 객체를 생성해준다.
			3) OracleDriver 객체를 DriverManager에 등록시켜준다.
				--> DriverManager 는 여러 드라이버들을 Vector에 저장하여 관리해주는 클래스이다.
		 */
		try {
			// >>> 1. 오라클 드라이버 로딩 <<<
			/*
				=== OracleDriver(오라클 드라이버)의 역할 ===
				1) OracleDriver 를 메모리에 로딩시켜준다.
				2) OracleDriver 객체를 생성해준다.
				3) OracleDriver 객체를 DriverManager에 등록시켜준다.
					--> DriverManager 는 여러 드라이버들을 Vector에 저장하여 관리해주는 클래스이다.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// >>> 2. 어떤 오라클서버에 연결 할래? (local 이냐 remote이냐) <<<
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "myorauser", "eclasee");
		
				
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

}


