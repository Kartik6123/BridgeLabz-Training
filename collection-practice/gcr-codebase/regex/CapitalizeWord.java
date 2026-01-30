import java.util.regex.*;
public class CapitalizeWord {
    public static  void main(String[] args){
        String str="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";


        String regex="[A-Z][a-z]*";
            

        
        
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
        }


    }
    
}
