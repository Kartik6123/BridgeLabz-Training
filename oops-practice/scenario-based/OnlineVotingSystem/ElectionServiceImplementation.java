package OnlineVotingSystem;
import java.util.*;

public class ElectionServiceImplementation implements ElectionService {

    private List<Voter> voters = new ArrayList<>();
    private List<Candidate> candidates = new ArrayList<>();

    public void registerVoter(Voter v) {
        voters.add(v);
    }

    public void addCandidate(Candidate c) {
        candidates.add(c);
    }

    public void castVote(Vote v) throws DuplicateVoteException {

        if (v.getVoter().hasVoted())
            throw new DuplicateVoteException("Voter has already voted");

        v.getCandidate().addVote();
        v.getVoter().markVoted();
    }

    public void declareResult() {
        for (Candidate c : candidates) {
            System.out.println(c.getName() + " : " + c.getVotes());
        }
    }
}

