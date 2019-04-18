package SEED.Data;

import SEED.Model.Company;
import SEED.Model.Student;
import SEED.Model.University;

import java.util.Arrays;
import java.util.List;

public class StudentRepository {

	UniversityRepository unilist = new UniversityRepository();

	private List<Student> ALL_STUDENTS;


	public StudentRepository() {
		// filler data
		ALL_STUDENTS.add(new Student(1, "joe", unilist.getById(1)));
		ALL_STUDENTS.add(new Student(2, "frank", unilist.getById(1)));
		ALL_STUDENTS.add(new Student(3, "soma", unilist.getById(2)));
	}

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

	public void addStudent(Student student) {
		ALL_STUDENTS.add(student);
	}

	public void removeStudent(int id) {

		for (Student student : ALL_STUDENTS) {
			if (id == student.getId())
				ALL_STUDENTS.remove(id);
		}
	}

	public void updateStudentById(int id, String studentName, University university) {
		Student student = findById(id);
		try {
			student.setId(id);
			student.setFname(studentName);
			student.setUniversity(university);
		} catch (NullPointerException e) {
			System.out.print("Caught NullPointerException");
		}

	}
}
