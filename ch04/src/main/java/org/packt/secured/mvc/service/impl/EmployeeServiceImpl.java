package org.packt.secured.mvc.service.impl;

import org.packt.secured.mvc.dao.EmployeeDao;
import org.packt.secured.mvc.model.data.Employee;
import org.packt.secured.mvc.model.form.EmployeeForm;
import org.packt.secured.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDaoImpl;


    @Override
    public List<Employee> readEmployees() {
        return employeeDaoImpl.getEmployees();
    }

    @Override
    public void addEmployee(EmployeeForm empForm) {
        Employee emp = new Employee();
        emp.setEmpId(empForm.getEmpId());
        emp.setFirstName(empForm.getFirstName());
        emp.setLastName(empForm.getLastName());
        emp.setAge(empForm.getAge());
        emp.setBirthday(empForm.getBirthday());
        emp.setEmail(empForm.getEmail());
        emp.setDeptId(empForm.getDeptId());
        employeeDaoImpl.addEmployeeBySJI(emp);
    }
}
