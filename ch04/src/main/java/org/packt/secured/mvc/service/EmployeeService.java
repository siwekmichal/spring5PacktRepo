package org.packt.secured.mvc.service;

import org.packt.secured.mvc.model.data.Employee;
import org.packt.secured.mvc.model.form.EmployeeForm;

import java.util.List;

public interface EmployeeService {
    public List<Employee> readEmployees();
    public void addEmployee(EmployeeForm emp);
}
