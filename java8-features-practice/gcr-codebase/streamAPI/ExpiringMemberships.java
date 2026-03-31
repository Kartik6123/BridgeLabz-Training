import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ExpiringMemberships {

    // Member class
    static class Member {
        private String name;
        private LocalDate expiryDate;

        public Member(String name, LocalDate expiryDate) {
            this.name = name;
            this.expiryDate = expiryDate;
        }

        public String getName() {
            return name;
        }

        public LocalDate getExpiryDate() {
            return expiryDate;
        }
    }

    public static void main(String[] args) {

        // Today's date
        LocalDate today = LocalDate.now();

        // Source: list of gym members
        List<Member> members = Arrays.asList(
            new Member("Rahul", today.plusDays(10)),
            new Member("Ankit", today.plusDays(25)),
            new Member("Amit", today.plusDays(40)),
            new Member("Neha", today.minusDays(5)),   // already expired
            new Member("Sonia", today.plusDays(30))
        );

        // Stream pipeline
        List<Member> expiringSoon = members.stream()

            // Filter memberships expiring within next 30 days
            .filter(m ->
                !m.getExpiryDate().isBefore(today) &&
                 m.getExpiryDate().isBefore(today.plusDays(31))
            )

            .collect(Collectors.toList());

        // Print result
        System.out.println("Members with memberships expiring in next 30 days:");
        expiringSoon.forEach(m ->
            System.out.println(
                m.getName() + " → Expiry Date: " + m.getExpiryDate()
            )
        );
    }
}
