import java.sql.*;
public class conn {
	Connection con;
	void connenct() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tproject","root","170899");
		System.out.println("Connection Established");
		
	}
	
	public static void main(String... g)
	{
		conn obj=new conn();
		try
		{
			obj.connenct();
			//obj.insert();
		}
	    catch(Exception e)
		{
	    	System.out.println(e);
		}
	}
 } 
