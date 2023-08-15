package gam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseConnection {
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User id:-");
		int u_id=sc.nextInt();
		System.out.println("Enter user name:-");
		String u_name= sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/demo","root","jayant");
		Statement st=con.createStatement();
		String insertQuery="insert into user "
				+ "values('"+u_id+"','"+u_name+"')";
		int res=st.executeUpdate(insertQuery);
		
		if(res == 0) {
			System.out.println("Recored not inserted");
		}else {
			System.out.println("Recored inserted succesfully");
		}
		System.out.println("lol");
		st.close();
		con.close();

	}
}