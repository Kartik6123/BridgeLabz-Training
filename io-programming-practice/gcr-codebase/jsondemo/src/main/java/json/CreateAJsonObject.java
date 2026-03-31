package json;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateAJsonObject {
	public static void main(String[] args) {
		
		//create a json object
		JSONObject json=new JSONObject();
		json.put("name","Abhinav");
		json.put("age", 22);
		 
		//create a json array for subjects
		JSONArray subjects=new JSONArray();
		subjects.put("Computer Science");
		subjects.put("Maths");
		subjects.put("Science");
		
		//put the contents of json array in json object
		json.put("subjects",subjects);
		
		System.out.println(json.toString(2));
	}

}
