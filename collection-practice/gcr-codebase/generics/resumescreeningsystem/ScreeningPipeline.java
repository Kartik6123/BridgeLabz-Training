import java.util.*;

public class ScreeningPipeline {
	public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening resumes for: " + role.getJobRole());
        }
    }
}