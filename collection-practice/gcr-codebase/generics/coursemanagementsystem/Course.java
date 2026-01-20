 
public class Course<T extends CourseType> {
	private String courseName;
	private T courseType;
	public Course(String courseName,T courseType) {
		this.courseName = courseName;
		this.courseType = courseType;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public T getCourseType() {
		return courseType;
	}
}