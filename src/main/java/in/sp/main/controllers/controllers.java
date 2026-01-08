package in.sp.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sp.main.entities.student;
import in.sp.main.services.studentService;

@Controller
public class controllers {
	
	@Autowired
	private studentService studentservice;
	
	@GetMapping("/regPage")
	public String openregPag(Model model) {
		model.addAttribute("std", new student());
		return "register";
	}
	
	
	@PostMapping("/regForm")
	public String submitregform(@ModelAttribute("std") student std ,Model model) {
		boolean status = studentservice.registerStudent(std);
		if(status) {
			model.addAttribute("successmsg","User registered successfully");
		}else {
			model.addAttribute("errormsg","user not registered due to some error");
		}
		return"register";
		
	}
	
	
	@GetMapping("/loginPage")
	public String openLoginPage(Model model) {
		model.addAttribute("std", new student());
		return "login";
	}
	@PostMapping("/loginForm")
	public String submitloginform(@ModelAttribute("std") student std , Model model) {
		student stu = studentservice.loginstudent(std.getEmail(), std.getCity());
		
		if(stu != null) {
			return"profile";
			
		}else {
			model.addAttribute("errormsg", "Email or password didn't matched");
			return "register";
		}
		
	}
}
