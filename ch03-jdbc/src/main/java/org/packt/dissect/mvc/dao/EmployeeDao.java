package org.packt.dissect.mvc.dao;

import org.packt.dissect.mvc.model.data.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getEmployees();
    public List<Employee> getEmployeeDept(Integer deptId);
    public Employee getEmployee(Integer id);
    public void addEmployeeBySJI (Employee emp);
    public void addEmployeeByJT (Employee emp);
    public void updateEmployee (Employee emp);
    public void deleteEmployee (Integer empId);

}
