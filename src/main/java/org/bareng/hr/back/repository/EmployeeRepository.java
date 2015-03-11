package org.bareng.hr.back.repository;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.bareng.hr.back.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {
	@Select("select * from t_employee emp where emp.id=#employeeId")
	Employee findOneById(@Param("employeeId") Integer employeeId);
}
