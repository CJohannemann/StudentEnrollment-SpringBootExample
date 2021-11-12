package com.StudentEnrollment.StudentEnrollment.DAO;

import com.StudentEnrollment.StudentEnrollment.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    List<Employee> findByCompanyCode(String companyCode);
}
