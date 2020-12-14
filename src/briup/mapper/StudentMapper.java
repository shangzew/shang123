package briup.mapper;

import java.util.List;

import briup.pojo.Student;

public interface StudentMapper {
	List<Student> findAllStudents(); 
	Student findStudentById(Integer id); 
	void insertStudent(Student student);
}
