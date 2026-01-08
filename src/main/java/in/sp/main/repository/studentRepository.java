package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entities.student;
import java.util.List;


public interface studentRepository extends JpaRepository<student, Integer>{
	
	student findByEmail(String email);

}
