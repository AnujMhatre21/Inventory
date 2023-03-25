package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.Repository.subjectRepository;
import com.xadmin.SpringBootCrud.bean.Subject;

@Service
public class subjectService {
	@Autowired
	private subjectRepository subjectRepository;

	public List<Subject> getSubjects() {
		
		List<Subject> subjects = new ArrayList<>();
		subjectRepository.findAll().forEach(subjects::add);
		return subjects;

	}

	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		
	}
}
