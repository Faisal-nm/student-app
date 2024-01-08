package com.faisal.springboot.springDataJpa;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.faisal.springboot.springDataJpa.entities.Student;
import com.faisal.springboot.springDataJpa.repositories.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDataJpaApplicationTests {


	@Autowired
	private StudentRepository studentRepository;


	@Test
	public void testStudentLoads() {
		Student student = new Student();
		student.setId(1l);
		student.setName("Faisal");
		student.setTestScore(100);

		studentRepository.save(student);
		Student savedStudent = studentRepository.findById(1l).get();
		assertNotNull(savedStudent);
	}

}
