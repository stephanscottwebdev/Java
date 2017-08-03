//Stephan Scott
public class CoursesScott {
	private static final Object CoursesScott = null;
	private int CRN; 
	private String CourseID;
	private String CourseName;
	private int Credits;
	private String Instructor;
	private static int NextCRN = 25000;
/* Add a new method to the Course class to duplicate course details.  
 * This method should return a course and use all the same course details as the course it is based 
 * off of, but it will receive a new CRN (the next one available from the static variable). 
 * The constructor in the method might look a little funky but this is how you can get the data out 
 * of the object you are using:*/
	CoursesScott c = new CoursesScott(this.CourseID, this.CourseName, this.Credits);
	public Object CoursesScott(){
	return CoursesScott;
	}
	public CoursesScott(String CourseID, String courseName, int Credits, String Instructor)
	{
		setCourseID(CourseID);
		setCourseName(courseName);
		setCredits(Credits);
		setInstructor("staff");	
	NextCRN++;
	CRN = NextCRN;
	
	if(getCourseID() == null || getCourseName() == null || getCredits() == 0){
		throw new IllegalArgumentException("Object not created");
	}
	}
	public CoursesScott(String courseID2, String courseName2, int credits2) {
		// TODO Auto-generated constructor stub
	}
	//Gets and Sets
	public int getCRN() {
		return CRN;
	}

	public String getCourseID() {
		return CourseID;
	}
	public void setCourseID(String courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getCredits() {
		return Credits;
	}
	public void setCredits(int credits) {
		if (credits > 5){
			System.out.println("Too many credits.");
		}
		Credits = credits;
	}
	public String getInstructor() {
		return Instructor;
	}
	public void setInstructor(String instructor) {
		Instructor = instructor;
	}
	@Override
	public String toString() {
		return "CoursesScott [CRN=" + CRN + ", CourseID=" + CourseID + ", CourseName=" + CourseName + ", Credits="
				+ Credits + ", Instructor=" + Instructor + "]";
	}
	public String CourseInfo(){
		CRN = getCRN();
		CourseID = getCourseID();
		CourseName = getCourseName();
		Credits = getCredits();
		Instructor = getInstructor();
		return(CourseID + "," + " CRN " +  CRN + ", " + CourseName + ", " + "Credits: " + Credits + ", " + "Instructor: " + Instructor);
	}

}
