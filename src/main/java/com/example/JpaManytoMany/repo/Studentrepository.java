/**
 * 
 */
package com.example.JpaManytoMany.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManytoMany.entity.Student;

/**
 * @author Administrator
 *
 */
public interface Studentrepository extends JpaRepository<Student,Long> {

	List<Student> findByNameContaining(String name);

}
