package sql;

import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.Connection;

public class DeleteFirst {
	public static void main(String[] args) {
		Connection connection=null;
		 Statement statement=null;
		 String url2="jdbc:mysql://localhost:3306/employee?user=root&password=root";
		 String query2="delete from dept where Job='PRESIDENT'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
	  connection=DriverManager.getConnection(url2);
	    statement=connection.createStatement();
	   int result=statement.executeUpdate(query2);
	   if(result !=0) {
		   System.out.println(result+"  rows are affected ");
		   System.out.println("Data Deleted succuseefully");
	   }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (connection !=null) {
					connection.close();
				}
				if(statement !=null) {
					statement.close();
				}
			}catch(Exception e) {
				System.out.println("_________");
			}
		}
		
	}

}
