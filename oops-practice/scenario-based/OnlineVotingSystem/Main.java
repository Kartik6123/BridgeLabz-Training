package OnlineVotingSystem;
public class Main {
    public static void main(String[] args) {

        ElectionService service = new ElectionServiceImplementation();

        Voter v1 = new Voter(1, "Kartik");
        Candidate c1 = new Candidate(101, "Alice");
        Candidate c2 = new Candidate(102, "Bob");

        service.registerVoter(v1);
        service.addCandidate(c1);
        service.addCandidate(c2);

        try {
            service.castVote(new Vote(v1, c1));
            service.castVote(new Vote(v1, c2));
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        service.declareResult();
    }
}

