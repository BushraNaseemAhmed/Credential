import javax.swing.text.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JavaMongo {

	public static void main(String[] args) 
	{
		// Create a Mongo Client
		MongoClient mongoClient=new MongoClient("localhost",3306);
		System.out.println("Created Mongo Connection Succesfully ");
		
		MongoDatabase db=mongoClient.getDatabase("Youtube...");
		System.out.println("Get database is Sucessfully");
		
		
		System.out.println("Below are list of database present in MongoDB...");
		
		
		//To get all database names
		MongoCursor<String> dbsCursor=mongoClient.listDatabaseNames().iterator();
		while(dbsCursor.hasNext())
		{
			System.out.println(dbsCursor.next());
		}
		
		MongoCollection<Document> collection=db.getCollection("Channel.....");
		Document doc=new Document("name","img","summmary");
		collection.insertOne(doc);
		
		System.out.println("################ Inser is Completed ###########");
		
	}

}
