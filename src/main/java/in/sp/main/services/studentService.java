package in.sp.main.services;

import in.sp.main.entities.student;

public interface studentService {
	
	public boolean registerStudent(student std);
	
	public student loginstudent(String email, String city);

}
