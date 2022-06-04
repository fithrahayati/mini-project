package com.test.miniproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.miniproject.model.Student;

	
@Repository	
public interface StudentRepository extends JpaRepository<Student, Long> {

	Student findByNama(String nama);
	
	@Query(value="select * from student ", nativeQuery= true)		
	public List<Student> getAllStudents();
	
	@Query(value="select * from student s where s.id=:id ", nativeQuery= true)		
	public List<Student> getStudentById(@Param("id") long id);
	
	@Query(value="select * from student s where s.nama=:nama ", nativeQuery= true)		
	public List<Student> getStudentByNama(@Param("nama") String nama);
	
	@Query(value="delete * from student s where s.id=:id ", nativeQuery= true)		
	public String  deleteStudent(@Param("id") Long id);
	
}
