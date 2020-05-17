package CellPhoneStore;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Main {

	public static void main(String[] args) throws Exception {
		MongoClient mongodb;
		try {
			mongodb = new MongoClient("localhost", 27017);
			DB db = mongodb.getDB("CellPhoneStore");
			DBCollection collection = db.getCollection("celulares");
			
			DBCursor cursor = collection.find();
		      try {
		        while (cursor.hasNext()) {
		          System.out.println(cursor.next().toString());
		        }
		      } finally {
		        cursor.close();
		      }

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
