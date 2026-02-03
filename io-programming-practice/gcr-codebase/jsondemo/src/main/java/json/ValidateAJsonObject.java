package json;

import org.json.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateAJsonObject {
	public static void main(String[] args) {
		
		//create a json object
		JSONObject json=new JSONObject();
		json.put("Name","Abhinav");
		json.put("City","Aligarh");
		json.put("Age",22);
		
		//create a object mapper for mapping json object
		ObjectMapper mapper=new ObjectMapper();
		
		try {
			//read the json object to vallidate the format
			mapper.readTree(json.toString());
			System.out.println("Json Structure is valid..");
		}catch(Exception e) {
			System.out.println("Json Structure is not valid!");
			e.printStackTrace();
		}
	}

	
}
