package SEED.Data;

import SEED.Model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepository {

	UniversityRepository unilist = new UniversityRepository();

	private List<Student> ALL_STUDENTS = Arrays.asList(new Student(1, "joe", "average", unilist.findById(1)),
			new Student(2, "frank", "alsoAverage", unilist.findById(1)),
			new Student(3, "some", "notAverage", unilist.findById(2)));

	public List<Student> getAllElements() {
		return ALL_STUDENTS;
	}

	public Student findById(int id) {
		for (Student Student : ALL_STUDENTS) {
			if (id == Student.getId())
				return Student;
		}
		return null;
	}

	// Add a compay to the list
	public Student addStudent(Student stud) {
		ALL_COMPANIES.add(stud);

	}

	// Remove a company from the list.
	public Student removeStudent(int id) {

		for (Student student : ALL_COMPANIES) {
			if (id == Student.getId())
				return Student;
		}
		return ALL_STUDENTS.remove(Student);

	}

	// Update a company
	public void updateStudentById(int id, String studentName, ArrayList<University> ALL_UNIVERSITIES) {
		Company c = getById(id);
		try {
			c.setId(id);
			c.setName(studentName);
			c.setUniversity(ALL_UNIVERSITIES);
		} catch (NullPointerException e) {
			System.out.print("Caught NullPointerException");
		}

}
