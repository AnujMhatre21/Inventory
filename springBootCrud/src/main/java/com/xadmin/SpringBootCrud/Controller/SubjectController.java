package com.xadmin.SpringBootCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.service.subjectService;

@RestController
public class SubjectController {

	@Autowired
	private subjectService subjectService;

	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects() {
		return subjectService.getSubjects();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/subjects")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
		
		
	}

}
