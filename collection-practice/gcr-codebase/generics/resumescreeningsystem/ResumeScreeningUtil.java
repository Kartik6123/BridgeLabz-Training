public class ResumeScreeningUtil {
	public static <T extends JobRole> boolean screenResume(Resume<T> resume) {
        return resume.getExperience() >= resume.getJobRole().minimumExperience();
    }
}