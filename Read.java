import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
// To Read The Data from DataBase------>
import com.mysql.cj.protocol.Resultset;

public class Read {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Step 1 Completed...");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bushra@23");
			System.out.println("step 2 Completed...");
			
			PreparedStatement pstmt=con.prepareStatement("insert into Kes_Shroff.database values(?,?,	?)");
//			
			pstmt.setInt(1,110001);
//			pstmt.setString(2,"Rishab");
//			pstmt.setString(3, "Msc-Data-Science");
//			pstmt.executeUpdate();
			
//			pstmt.setInt(1,110200);
//			pstmt.setString(2,"Nikita");
//			pstmt.setString(3, "Msc-IT");
//			pstmt.executeUpdate();
//			
//			pstmt.setInt(1,11300);
//			pstmt.setString(2,"Vandana");
//			pstmt.setString(3, "Msc-Economics");
//			pstmt.executeUpdate();
//			
			
			ResultSet rs=pstmt.executeQuery();
			
			if(id==11300)
			{
				int Id=rs.getInt(1);
				String name=rs.getString(2);
				String batch=rs.getString(3);
				
				System.out.println(Id+" "+name+" "+batch);
			}
			else
			{
				System.out.println("No Such data Exist");
			}
		} catch (Exception e)
		{
			
			e.printStackTrace();
		}
	}

}
