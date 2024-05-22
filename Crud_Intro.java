package crud_operation;
//Q1 Using API this Step are followed to Creat and Perform Crud Operation on database Using Java....
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Crud_Intro {
  // Click on the Maven Project that you ahve created then click on Build path ---> Configure path
	//Now click on Libraries --->Using Add External Jar File select your API that you have downloaded.
	//Now Click on Apply and then Apply Close the jar file will be Imported in Your Project  
	public static void main(String[] args) 
	{
		// Following This step You can easily connect your java file with your database
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Firts Step Completed.....");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost=3306?user=root&password=bushra@23");
			System.out.println("Step Two Completed.....");
			
			Statement stmt=con.createStatement();
			System.out.println("Step Three Completed.....");
			
			// stmt.execute("here write the Sql Queries to Perform The CRUD operation ");
			
		} catch (Exception e) {
			

			e.printStackTrace();
		}

	}

}
