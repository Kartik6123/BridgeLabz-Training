package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.Map;

public class IplAnalyser {

    //model class
    static class Match {
        public int match_id;
        public String team1;
        public String team2;
        public Map<String, Integer> score;
        public String winner;
        public String player_of_match;
    }

   // logic for censoring
    static String maskTeamName(String team) {
        if (team == null || !team.contains(" ")) {
            return "***";
        }
        return team.split(" ")[0] + " ***";
    }

    static String redactPlayer() {
        return "REDACTED";
    }

    public static void main(String[] args) {

        //input file path
        String inputJsonPath =
                "C:\\Users\\Abhinav\\eclipse-workspace\\jsondemo\\src\\main\\java\\Json\\ipldata.json";

        //output file path
        String outputJsonPath =
                "C:\\Users\\Abhinav\\eclipse-workspace\\jsondemo\\src\\main\\java\\Json\\ipldata_censored.json";
        
        //create a object mapper
        ObjectMapper mapper = new ObjectMapper();

        try {
            //read JSON array from file
            List<Match> matches =mapper.readValue(new File(inputJsonPath),mapper.getTypeFactory().constructCollectionType(List.class, Match.class));

            //apply censorship rules
            for (Match match : matches) {
                match.team1 = maskTeamName(match.team1);
                match.team2 = maskTeamName(match.team2);
                match.winner = maskTeamName(match.winner);
                match.player_of_match = redactPlayer();
            }

            //write censored JSON to new file
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputJsonPath), matches);

            System.out.println("IPL JSON Censorship Completed Successfully");
            System.out.println("Output File: ipldata_censored.json");

        } catch (Exception e) {
            System.out.println("Error processing IPL JSON data");
            e.printStackTrace();
        }
    }
}
