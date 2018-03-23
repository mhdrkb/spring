package com.coderbd.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coderbd.entity.UserRole;
import com.coderbd.repository.RoleRepository;
import com.coderbd.service.RoleService;

@Service("roleService")
@Repository
@Transactional
public class RoleServiceImpl implements RoleService {
	final static Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void create(UserRole userRole) {
		roleRepository.saveAndFlush(userRole);
		
	}

	@Override
	public void update(UserRole userRole) {
		roleRepository.saveAndFlush(userRole);
		
	}

	@Override
	public void delete(UserRole userRole) {
		roleRepository.delete(userRole);
		
	}

	@Override
	public Iterable<UserRole> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public UserRole findByRoleName(String roleName) {
			return roleRepository.findByRoleName(roleName);
	}

}
