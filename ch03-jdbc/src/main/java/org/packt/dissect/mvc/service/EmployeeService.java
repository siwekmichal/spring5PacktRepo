package org.packt.dissect.mvc.service;

import org.packt.dissect.mvc.model.data.Employee;
import org.packt.dissect.mvc.model.form.EmployeeForm;

import java.util.List;

public interface EmployeeService {
    public List<Employee> readEmployees();
    public void addEmployee(EmployeeForm emp);
}
