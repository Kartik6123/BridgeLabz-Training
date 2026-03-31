package OnlineVotingSystem;
public interface ElectionService {
    void registerVoter(Voter v);
    void addCandidate(Candidate c);
    void castVote(Vote v) throws DuplicateVoteException;
    void declareResult();
}

