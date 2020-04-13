package prac.jdbc.day01.statement;

import java.sql.*;

public class jdbcTest01_DDL {

	public static void main(String[] args) {
		
		Connection conn = null;
		// Connection conn �� ����Ŭ�����ͺ��̽� ������ ������ �ξ��ִ� ��ü�̴�.
		
		Statement stmt = null;
		/*
			�����ڰ� SQL��(����)�� �ۼ��ߴµ�,
			�ۼ��� SQL���� ��� ����Ŭ�������� �����ؾ� �� �� �����ؾ� �Ѵ�.
			�̋�, ��� ����Ŭ���������� Connection conn���� �˰�,
			Connection conn�� ������ SQL��(����)�� Statement stmt(�����޺�)�� ���� ���۵ȴ�.
		 */
		
		// >>> 1. ����Ŭ ����̹� �ε� <<<
		/*
			=== OracleDriver(����Ŭ ����̹�)�� ���� ===
			1) OracleDriver �� �޸𸮿� �ε������ش�.
			2) OracleDriver ��ü�� �������ش�.
			3) OracleDriver ��ü�� DriverManager�� ��Ͻ����ش�.
				--> DriverManager �� ���� ����̹����� Vector�� �����Ͽ� �������ִ� Ŭ�����̴�.
		 */
		try {
			// >>> 1. ����Ŭ ����̹� �ε� <<<
			/*
				=== OracleDriver(����Ŭ ����̹�)�� ���� ===
				1) OracleDriver �� �޸𸮿� �ε������ش�.
				2) OracleDriver ��ü�� �������ش�.
				3) OracleDriver ��ü�� DriverManager�� ��Ͻ����ش�.
					--> DriverManager �� ���� ����̹����� Vector�� �����Ͽ� �������ִ� Ŭ�����̴�.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// >>> 2. � ����Ŭ������ ���� �ҷ�? (local �̳� remote�̳�) <<<
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "myorauser", "eclasee");
		
				
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}

}


