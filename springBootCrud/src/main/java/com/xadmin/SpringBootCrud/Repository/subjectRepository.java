package com.xadmin.SpringBootCrud.Repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCrud.bean.Subject;

public interface subjectRepository extends CrudRepository<Subject,String> {
													//class name,@ID datatype
}
