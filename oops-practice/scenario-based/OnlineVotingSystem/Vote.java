package OnlineVotingSystem;
    
public class Vote {
    private Voter voter;
    private Candidate candidate;

    public Vote(Voter voter, Candidate candidate) {
        this.voter = voter;
        this.candidate = candidate;
    }

    public Voter getVoter() {
        return voter;
    }

    public Candidate getCandidate() {
        return candidate;
    }
}

