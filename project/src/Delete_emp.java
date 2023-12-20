import java.sql.*;

public class Delete_emp {
	public static void deleteemployee() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/project";
		String username="root";
		String password="2003";
		String query="delete from exer2 where id=1003";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();	
	}
	public static void main(String[] args) throws Exception{
	deleteemployee();		
	}

}
