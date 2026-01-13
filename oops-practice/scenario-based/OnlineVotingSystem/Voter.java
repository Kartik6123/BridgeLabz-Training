package OnlineVotingSystem;
public class Voter { 
    // represents a voter in the online voting system 
    private int voterId;
    private String name;
    private boolean hasVoted = false;

    public Voter(int voterId, String name) {
        this.voterId = voterId;
        this.name = name;
    }

    public int getVoterId() {
        return voterId;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void markVoted() {
        hasVoted = true;
    }
}

