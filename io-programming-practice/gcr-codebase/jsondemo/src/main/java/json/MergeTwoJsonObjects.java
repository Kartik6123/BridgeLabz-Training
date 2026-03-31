package json;

import org.json.JSONObject;

public class MergeTwoJsonObjects {
	public static void main(String[] args) {
		
		//create one json object
		JSONObject json1=new JSONObject();
		json1.put("Name","Abhinav");
		json1.put("Age",22);
		
		//create another json object
		JSONObject json2=new JSONObject();
		json2.put("City","Aligarh");
		json2.put("Course","B.Tech");
		
		//join them using keyset
		for(String s:json1.keySet()) {
			json2.put(s,json1.get(s));
		}
		
		System.out.println(json2.toString(2));
	}
}
