package json;

import org.json.JSONObject;
import org.json.JSONArray;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

//create a class
class Car{
	public String brand;
	public String model;
	public double price;
	
	public Car(String brand,String model,double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
}

public class JavaObjectIntoJsonObject {
	public static void main(String[] args) {
		try {
			//use ObjectMapper for mapping json values
			ObjectMapper mapper=new ObjectMapper();
			Car car=new Car("Suzuki","Dzire",799999.0);
			//convert the values to string
			String tojson=mapper.writeValueAsString(car);
			System.out.println(tojson);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
