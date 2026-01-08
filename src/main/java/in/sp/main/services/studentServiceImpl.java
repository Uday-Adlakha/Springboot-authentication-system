package in.sp.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.student;
import in.sp.main.repository.studentRepository;


@Service
public class studentServiceImpl implements studentService{

	@Autowired
	private studentRepository studentrepo;
	@Override
	public boolean registerStudent(student std) {
		try{
			studentrepo.save(std);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	@Override
	public student loginstudent(String email, String city) {
		student validstd= studentrepo.findByEmail(email);
		if(validstd != null && validstd.getCity().equals(city)) {
			return validstd;
		}
		return null;
	}

}
