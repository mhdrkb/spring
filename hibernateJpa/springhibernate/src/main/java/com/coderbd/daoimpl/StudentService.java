package com.coderbd.daoimpl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.dao.StudentDAO;
import com.coderbd.domain.Student;
import com.coderbd.util.EntityService;


@Component
@Transactional
public class StudentService extends EntityService<Student> implements StudentDAO{

}
