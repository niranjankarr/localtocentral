package sqldatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqldemo1 
{

	public static void main(String[] args) throws SQLException 
	{
		Connection arif=DriverManager.getConnection("jdbc:mysql://localhost:3306/rbgtechnologies","root","root");
	Statement S= arif.createStatement();
	String query = "insert into knr values (600,'naresh','kukatpally',20000)";
	S.execute(query);
	arif.close();
	System.out.println("done");
	

	}
}
