package com.StudentEnrollment.StudentEnrollment.Controller;

import com.StudentEnrollment.StudentEnrollment.DAO.EmployeeRepository;
import com.StudentEnrollment.StudentEnrollment.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
@Autowired
    private EmployeeRepository repository;

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return "Employee Added";
    }

    @GetMapping("/getEmployee/{companyCode}")
    public List<Employee> getEmployeesByName(@PathVariable String companyCode){
        return repository.findByCompanyCode(companyCode);
    }

}
