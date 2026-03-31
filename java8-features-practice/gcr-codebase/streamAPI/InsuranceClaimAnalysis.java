import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

    // Claim class
    static class Claim {
        private String claimType;
        private double amount;

        public Claim(String claimType, double amount) {
            this.claimType = claimType;
            this.amount = amount;
        }

        public String getClaimType() {
            return claimType;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static void main(String[] args) {

        // Source: list of claims
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 50000),
            new Claim("Vehicle", 30000),
            new Claim("Health", 70000),
            new Claim("Life", 100000),
            new Claim("Vehicle", 40000),
            new Claim("Health", 60000)
        );

     Map<String, Double> map = claims.stream()
    .collect(
        Collectors.groupingBy(
            (Claim d) -> d.getClaimType(),
            Collectors.averagingDouble((Claim e) -> e.getAmount())
        )
    );


    map.forEach((a,b)->System.out.print(a+" "+b)
    );
        // Stream pipeline 
       
    }
}
