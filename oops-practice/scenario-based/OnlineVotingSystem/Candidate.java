package OnlineVotingSystem;

public class Candidate { 
    // represents a candidate in the online voting system
    private int candidateId;
    private String name;
    private int votes = 0;

    public Candidate(int candidateId, String name) {
        this.candidateId = candidateId;
        this.name = name;
    }

    public void addVote() {
        votes++;
    }

    public int getVotes() {
        return votes;
    }

    public String getName() {
        return name;
    }
}

