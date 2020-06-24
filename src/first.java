import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.*;

public class first 
 {
	Connection con;
	Scanner sc;
	void connenct() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","170899");
		System.out.println("Connection Established");
		
	}
	
	//how to add a record
	
	void insert() throws Exception
	{
		String name;
		int p,q;
		sc= new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Qty");
		q=sc.nextInt();
		System.out.println("Enter Price");
		p=sc.nextInt();
		
		//adding record
		
		PreparedStatement ps = con.prepareStatement("insert into product(name,quantity,price) values(?,?,?)");
		//in question marks(placeholders) order matters
			
		//BINDING OF ? with variables
		ps.setString(1, name);
		ps.setInt(2, q);    //1,2,3 are indexes of placeholders
		ps.setInt(3, p);
		
		ps.executeUpdate();    //execute the query and update at database
		System.out.println("Record Insert!");
	}
	void list() throws Exception
	{
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from product");
		System.out.println("ID\tName\tQuantity\tPrice \n");
		while(rs.next())
		 {
			System.out.println(rs.getInt("id")+"\t"+rs.getString("Name")+"\t"+rs.getInt("quantity")+"\t"+rs.getInt("price")+"\n");
		 }
	}
	
	public static void main(String... g)
	{
		first obj=new first();
		try
		{
			obj.connenct();
			//System.out.println("Insert A New Record");
			//obj.insert();
			System.out.println("Records:");
			obj.list();
		}
	    catch(Exception e)
		{
	    	System.out.println(e);
		}
	}
 } 
