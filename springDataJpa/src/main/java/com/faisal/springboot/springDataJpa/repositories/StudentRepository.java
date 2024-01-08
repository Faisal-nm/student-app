package com.faisal.springboot.springDataJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faisal.springboot.springDataJpa.entities.Student;

//@EnableJpaRepositories("my.package.base.*")
//@ComponentScan(basePackages = { "my.package.base.*" })
//@EntityScan("my.package.base.*") 
//@EnableJpaRepositories
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
//	@Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Student s WHERE s.studentEmail = ?1")
//	public Boolean getStudentById(Long id) ;

}
