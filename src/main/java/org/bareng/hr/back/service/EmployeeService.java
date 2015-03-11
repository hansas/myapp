package org.bareng.hr.back.service;

import javax.validation.constraints.NotNull;

import org.bareng.hr.back.entity.Employee;

public interface EmployeeService {
	/**
	 * Find employee details by id.
	 * 
	 * @param id
	 * @return
	 */
	Employee getEmployeeDetails(@NotNull Integer id);
}
