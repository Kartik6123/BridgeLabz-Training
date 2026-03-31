package json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class ReadAJsonFile {

    public static void main(String[] args) {
    	//specify the path
        String filePath = "C:\\Users\\Abhinav\\eclipse-workspace\\jsondemo\\src\\main\\java\\Json\\student.json";
        //create a object mappper
        ObjectMapper mapper = new ObjectMapper();

        try {
            //read the JSON file into JsonNode
            JsonNode rootNode = mapper.readTree(new File(filePath));
            //print all keys and values
            printJson(rootNode, "");

        } catch (IOException e) {
            System.out.println("Error reading JSON file.");
            e.printStackTrace();
        }
    }

    //recursive method to traverse JSON
    private static void printJson(JsonNode node, String parentKey) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();

            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                printJson(entry.getValue(), parentKey + entry.getKey() + ".");
            }
        }
        else if (node.isArray()) {
            for (JsonNode arrayElement : node) {
                printJson(arrayElement, parentKey);
            }
        }
        else {
            //primitive value (String, Number, Boolean)
            System.out.println(parentKey.substring(0, parentKey.length() - 1)+ " : " + node.asText());
        }
    }
}
