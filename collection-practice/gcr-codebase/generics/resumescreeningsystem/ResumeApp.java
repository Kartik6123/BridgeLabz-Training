import java.util.*;
public class ResumeApp {

	public static void main(String[] args) {
		
		Resume<SoftwareEngineer> r1 = new Resume<>("Aman", 3, new SoftwareEngineer());

        Resume<DataScientist> r2 = new Resume<>("Neha", 2, new DataScientist());

        Resume<ProductManager> r3 = new Resume<>("Rahul", 6, new ProductManager());

        System.out.println(r1.getCandidateName() + " - " + ResumeScreeningUtil.screenResume(r1));

        System.out.println(r2.getCandidateName() + " - " + ResumeScreeningUtil.screenResume(r2));

        System.out.println(r3.getCandidateName() + " - " + ResumeScreeningUtil.screenResume(r3));

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.processResumes(roles);

	}

}
