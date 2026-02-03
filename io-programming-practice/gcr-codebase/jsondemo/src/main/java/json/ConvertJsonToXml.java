package json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class ConvertJsonToXml {

    public static void main(String[] args) {

        try {
            //create a object mapper
            ObjectMapper mapper = new ObjectMapper();

            //read JSON file
            JsonNode jsonNode =mapper.readTree(new File("C:\\Users\\Abhinav\\eclipse-workspace\\jsondemo\\src\\main\\java\\Json\\student.json"));

            // XmlMapper for XML conversion
            XmlMapper xmlMapper = new XmlMapper();
            // Convert JSON to XML String
            String xml =xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

            System.out.println("Converted XML:");
            System.out.println(xml);

        } catch (Exception e) {
            System.out.println("Error converting JSON to XML");
            e.printStackTrace();
        }
    }
}
