package com.jcg.mongodb.servlet;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Util {

	// Method to make a connection to the mongodb server listening on a default port
	private static MongoClient getConnection() {
		int port_no = 27017;
		String url = "localhost";

		MongoClient mongoClntObj = new MongoClient(url, port_no);
		return mongoClntObj;
	}

	// Method to search a user in the mongodb
	public static boolean searchUserInDb(String loginNit, String loginNombre, String loginDireccion, String loginContacto) {
		boolean user_found = false;
		String db_name = "CellPhoneStore",
				db_collection_name = "Prueba";

		// Get the mongodb connection
		MongoDatabase db = getConnection().getDatabase(db_name);

		// Get the mongodb collection.
		MongoCollection<Document> col = db.getCollection(db_collection_name);

		// Get the particular record from the mongodb collection		
		List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
		obj.add(new BasicDBObject("nit", loginNit));
		obj.add(new BasicDBObject("nombre", loginNombre));
                obj.add(new BasicDBObject("direccion", loginDireccion));
                obj.add(new BasicDBObject("contacto", loginContacto));

		// Form a where query
		BasicDBObject whereQuery = new BasicDBObject();
		whereQuery.put("$and", obj);
		System.out.println("Sql query is?= " + whereQuery.toString());

		FindIterable<Document> cursor = col.find(whereQuery);
		for(Document doc : cursor) {
			System.out.println("Found?= " + doc);
			user_found = true;
		}
		return user_found;
	}
}