import java.time.*;
import java.util.*;

class InsurancePolicyTwo {
    int no;
    String holder;
    LocalDate exp;
    String type;
    double prem;

    InsurancePolicyTwo(int no, String holder, LocalDate exp, String type, double prem) {
        this.no = no;
        this.holder = holder;
        this.exp = exp;
        this.type = type;
        this.prem = prem;
    }

    public String toString() {
        return no + " " + holder + " " + exp + " " + type + " " + prem;
    }
}

class PolicyStore {
    Map<Integer, InsurancePolicyTwo> hm = new HashMap<>();
    Map<Integer, InsurancePolicyTwo> lhm = new LinkedHashMap<>();
    TreeMap<LocalDate, List<InsurancePolicyTwo>> tm = new TreeMap<>();

    void add(InsurancePolicyTwo p) {
        hm.put(p.no, p);
        lhm.put(p.no, p);
        tm.computeIfAbsent(p.exp, x -> new ArrayList<>()).add(p);
    }

    InsurancePolicyTwo get(int no) {
        return hm.get(no);
    }

    Collection<InsurancePolicyTwo> all() {
        return lhm.values();
    }

    Map<LocalDate, List<InsurancePolicyTwo>> sortedByExpiry() {
        return tm;
    }

    void remove(int no) {
        InsurancePolicyTwo p = hm.remove(no);
        if (p == null) return;

        lhm.remove(no);
        List<InsurancePolicyTwo> l = tm.get(p.exp);
        l.remove(p);
        if (l.isEmpty()) tm.remove(p.exp);
    }
}

class PolicyService {

    static void expiringSoon(PolicyStore ps) {
        LocalDate now = LocalDate.now();
        LocalDate lim = now.plusDays(30);

        ((TreeMap<LocalDate,List<InsurancePolicyTwo>>) ps.sortedByExpiry()).subMap(now, true, lim, true)
          .values()
          .forEach(l -> l.forEach(System.out::println));
    }

    static void byHolder(PolicyStore ps, String h) {
        for (InsurancePolicyTwo p : ps.all())
            if (p.holder.equalsIgnoreCase(h))
                System.out.println(p);
    }

    static void removeExpired(PolicyStore ps) {
        LocalDate now = LocalDate.now();
        List<Integer> del = new ArrayList<>();

        for (InsurancePolicyTwo p : ps.all())
            if (p.exp.isBefore(now))
                del.add(p.no);

        for (int no : del)
            ps.remove(no);
    }
}
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolicyStore ps = new PolicyStore();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int no = sc.nextInt();
            String h = sc.next();
            LocalDate d = LocalDate.parse(sc.next());
            String t = sc.next();
            double p = sc.nextDouble();

            ps.add(new InsurancePolicyTwo(no, h, d, t, p));
        }

        int q = sc.nextInt();
        System.out.println(ps.get(q));

        System.out.println("Expiring soon:");
        PolicyService.expiringSoon(ps);

        String name = sc.next();
        System.out.println("By holder:");
        PolicyService.byHolder(ps, name);

        PolicyService.removeExpired(ps);
        System.out.println("After removing expired:");
        ps.all().forEach(System.out::println);
    }
}

