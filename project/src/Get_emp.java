import java.sql.*;

public class Get_emp {
	public static void getemployee() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/project";
		String username="root";
		String password="2003";
		String query="select*from exer2";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement pst=con.createStatement();
		ResultSet rs=pst.executeQuery(query);
		while(rs.next()) {
			System.out.println("id:"+rs.getInt(1));
			System.out.println("name:"+rs.getString(2));
			System.out.println("name:"+rs.getString(3));
		}
		con.close();	
	}
	public static void main(String[] args)throws Exception {
		getemployee();
	}

}
