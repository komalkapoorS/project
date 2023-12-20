import java.sql.*;
public class Create_emp {
	
	public static void create_employee() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/project";
		String username="root";
		String password="2003";
		String query="insert into exer2 values(?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, 1003);
		pst.setString(2,"Kumaravel");
		pst.setString(3,"chennai,kolathur");
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args) throws Exception {
		create_employee();
		}
}
