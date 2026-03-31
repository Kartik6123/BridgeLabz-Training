package json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class MergeTwoJsonFiles {

    public static void main(String[] args) {
    	//specify the files path
        String file1 = "C:\\Users\\Abhinav\\eclipse-workspace\\jsondemo\\src\\main\\java\\Json\\file1.json";
        String file2 = "C:\\Users\\Abhinav\\eclipse-workspace\\jsondemo\\src\\main\\java\\Json\\file2.json";

        //create a object mapper
        ObjectMapper mapper = new ObjectMapper();

        try {
            //read both JSON files
            JsonNode json1 = mapper.readTree(new File(file1));
            JsonNode json2 = mapper.readTree(new File(file2));

            //convert first JSON to ObjectNode
            ObjectNode mergedJson = (ObjectNode) json1;

            //merge second JSON into first
            Iterator<Map.Entry<String, JsonNode>> fields = json2.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                mergedJson.set(entry.getKey(), entry.getValue());
            }
            System.out.println("Merged JSON: ");
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedJson));

        } catch (Exception e) {
            System.out.println("Error merging JSON files.");
            e.printStackTrace();
        }
    }
}
