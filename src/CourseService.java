import java.util.HashMap;
import java.util.List;

public class CourseService{
    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, Course> courses = new HashMap<>();


    public CourseService()
    {
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
        
     
    }//main


	public void enrollStudent(String studentId, String courseId){
    	 Student student = students.get(studentId);
    	 Course course = courses.get(courseId);
    	 if (student != null && course != null) {
             student.enroll(course);
         }
     
    }//enrollStudent

    public void unEnrollStudent(String studentId, String courseId){
    	 Student student = students.get(studentId);
    	    Course course = courses.get(courseId);
    	    if (student != null && course != null) {
                student.unEnroll(course);
            }
    }//unEnrollStudent

    public void displayCourseInformation(String courseId){
    	 Course course = courses.get(courseId);
    	 if (course != null) {
             System.out.println(course);
         } else {
             System.out.println("No se encontro el curso.");
         }
    }//displayCourseInformation

    public void displayStudentInformation(String studentId){
    	  Student student = students.get(studentId);
    	  if (student != null) {
              System.out.println(student);
          } else {
              System.out.println("No se encontro al estudiante.");
          }
    }//displayStudentInformation
    public int getTotalCreditsForStudent(String studentId) {
        Student student = students.get(studentId);
        if (student != null) {
            int totalCredits = 0;
            List<Course> enrolledCourses = student.getEnrolledCourses();
            for (Course course : enrolledCourses) {
                totalCredits += course.credits;
            }
            return totalCredits;
        } else {
            System.out.println("Student not found.");
            return 0;
        }
    }//getTotalCreditsForStudent


}//CourseService