import java.util.ArrayList;

public class studentModel {
	private ArrayList<Student> studentlist = new ArrayList<Student>();
	
	
	public void add(String name, String course, String year) {
		Student newStudent = new Student(name, course, year);
		studentlist.add(newStudent);
	}
	
	public ArrayList<Student> getStudents() {
		return studentlist;
	}
}
