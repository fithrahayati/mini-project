package com.test.miniproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.miniproject.model.Student;
import com.test.miniproject.repository.StudentRepository;

	

@Service 	
public class StudentService {

	@Autowired	
	private StudentRepository repository;	
	
	public Student saveStudent(Student student) {
	return repository.save(student);
	
	}
	
	public List<Student> saveStudents(List<Student> students){
	return repository.saveAll(students);
					
	}

	//native sql query
	public List<Student> getAllStudents(){
	return repository.getAllStudents();
	}
		
	public List<Student> getStudentById(Long id){
	return repository.getStudentById(id);
	}
		
	public List<Student> getStudentByNama(String nama){	
	return repository.getStudentByNama(nama);
	}
	
	public Student updateStudent(Student student) {
		Student existingStudent = repository.findById(student.getId()).orElse(null);
		existingStudent.setNama(student.getNama());
		existingStudent.setJenisKelamin(student.getJenisKelamin());
		existingStudent.setTempatLahir(student.getTempatLahir());
		existingStudent.setAgama(student.getAgama());
		existingStudent.setAlamat(student.getAlamat());
        return repository.save(existingStudent);
    }
	
	public String deleteStudent(Long id) {
        repository.deleteById(id);
        return "Deleted Successfully !! " + id;
    }
	
	
	
}
