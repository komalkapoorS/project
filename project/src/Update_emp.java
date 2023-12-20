import java.sql.*;

public class Update_emp {
	public static void  updateemployee() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/project";
		String username="root";
		String password="2003";
		String query="update exer2 set name='Shreemathi'where id=1001";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception{
		updateemployee();	
	}
}
