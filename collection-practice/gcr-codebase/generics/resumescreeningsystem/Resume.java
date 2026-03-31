public class Resume<T extends JobRole> {
	private String candidateName;
	private int experience;
	private T jobRole;
	
	public Resume(String candidateName,int experience,T jobRole) {
		this.candidateName = candidateName;
		this.experience = experience;
		this.jobRole = jobRole;
	}
	
	public int getExperience() {
        return experience;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }
	
}