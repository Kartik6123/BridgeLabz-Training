import java.time.LocalDate;
import java.util.*;

public class InsurancePolicySystem {

    // ================== Policy Fields ==================
    static class Policy implements Comparable<Policy> {
        String policyNumber;
        String holderName;
        LocalDate expiryDate;
        String coverageType;
        double premiumAmount;

        Policy(String policyNumber, String holderName,
               LocalDate expiryDate, String coverageType,
               double premiumAmount) {
            this.policyNumber = policyNumber;
            this.holderName = holderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premiumAmount = premiumAmount;
        }

        // TreeSet sorting (by expiry date)
        @Override
        public int compareTo(Policy other) {
            return this.expiryDate.compareTo(other.expiryDate);
        }

        // Uniqueness based on policy number
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Policy)) return false;
            Policy p = (Policy) o;
            return policyNumber.equals(p.policyNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(policyNumber);
        }

        @Override
        public String toString() {
            return policyNumber + " | " + holderName + " | "
                    + coverageType + " | " + expiryDate;
        }
    }

    // ================== Different Sets ==================
    static Set<Policy> hashSet = new HashSet<>();
    static Set<Policy> linkedHashSet = new LinkedHashSet<>();
    static Set<Policy> treeSet = new TreeSet<>();

    // ================== Add Policy ==================
    static void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    // ================== Retrieve Policies ==================
    static void showAllPolicies() {
        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }

    static void expiringIn30Days() {
        LocalDate today = LocalDate.now();
        LocalDate next30 = today.plusDays(30);

        for (Policy p : hashSet) {
            if (!p.expiryDate.isBefore(today) &&
                !p.expiryDate.isAfter(next30)) {
                System.out.println(p);
            }
        }
    }

    static void policiesByCoverage(String type) {
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    static void findDuplicatePolicies(List<Policy> list) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (Policy p : list) {
            if (!seen.add(p.policyNumber)) {
                duplicate.add(p.policyNumber);
            }
        }
        System.out.println("Duplicate Policy Numbers: " + duplicate);
    }

    // ================== Performance Comparison ==================
    static void performanceTest(Set<Policy> set, String name) {
        Policy temp = new Policy("PX01", "Test",
                LocalDate.now().plusDays(5), "Health", 2000);

        long start, end;

        start = System.nanoTime();
        set.add(temp);
        end = System.nanoTime();
        System.out.println(name + " Add: " + (end - start));

        start = System.nanoTime();
        set.contains(temp);
        end = System.nanoTime();
        System.out.println(name + " Search: " + (end - start));

        start = System.nanoTime();
        set.remove(temp);
        end = System.nanoTime();
        System.out.println(name + " Remove: " + (end - start));
    }

    // ================== Main Method ==================
    public static void main(String[] args) {

        addPolicy(new Policy("P101", "Alice",
                LocalDate.now().plusDays(10), "Health", 5000));

        addPolicy(new Policy("P102", "Bob",
                LocalDate.now().plusDays(40), "Auto", 7000));

        addPolicy(new Policy("P103", "Carol",
                LocalDate.now().plusDays(20), "Health", 6000));

        System.out.println("\nAll Policies:");
        showAllPolicies();

        System.out.println("\nExpiring in 30 Days:");
        expiringIn30Days();

        System.out.println("\nHealth Policies:");
        policiesByCoverage("Health");

        System.out.println("\nPerformance Comparison:");
        performanceTest(hashSet, "HashSet");
        performanceTest(linkedHashSet, "LinkedHashSet");
        performanceTest(treeSet, "TreeSet");
    }
}
