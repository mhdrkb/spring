package com.coderbd.daoimpl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.dao.TeacherDAO;
import com.coderbd.domain.Teacher;
import com.coderbd.util.EntityService;



@Transactional
@Component
public class TeacherService extends EntityService<Teacher> implements TeacherDAO {

}
