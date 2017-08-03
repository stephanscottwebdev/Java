//Stephan Scott
public class CourseTesterScott {

	public static void main(String[] args) {
		
		CoursesScott Stephan = new CoursesScott("MDT 110-WW1", "Android App Development", 3, "");
		String course1 = Stephan.CourseInfo();
		System.out.println(course1);
		
		CoursesScott Stephan2 = new CoursesScott("MDT 110-WW1", "Android App Development", 3, "");
		String course2 = Stephan.CourseInfo();
		System.out.println(course1);
		
		CoursesScott Allison = new CoursesScott("LIFE 345-WR", "Guide to being Awesome", 5, "Stephan");
		String course3 = Allison.CourseInfo();
		System.out.println(course3);
		
		CoursesScott Nevaeh = new CoursesScott("WTF 1D4-LIFE", "One Direction Fan", 4, "");
		String course4 = Nevaeh.CourseInfo();
		System.out.println(course4);
		
		CoursesScott Mike = new CoursesScott("RAR 101", "Rock and Roll 101", 2, "Dave Grohl");
		String course5 = Mike.CourseInfo();
		System.out.println(course5);
		
		CoursesScott Paul = new CoursesScott("BH 156", "Another Class", 2, "Martha");
		String course6 = Paul.CourseInfo();
		System.out.println(course6);

	}
		
}