package org.bareng.hr.back.service;

import org.bareng.hr.back.entity.Employee;
import org.bareng.hr.back.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
@Transactional(readOnly=true)
public class MybatisEmployeeService implements EmployeeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(MybatisEmployeeService.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee getEmployeeDetails(Integer id) {
		LOGGER.debug("Retrieve employee details");
		return employeeRepository.findOneById(id);
	}
}
