package org.packt.secured.mvc.service;

import org.packt.secured.mvc.model.data.Department;
import org.packt.secured.mvc.model.form.DepartmentForm;

import java.util.List;


public interface DepartmentService {
    public List<Department> readDepartments();
    public void addDepartment(DepartmentForm dept);
    public void removeDepartment (Integer deptId);
    public Department getDeptId(Integer id);
    public void updateDepartment(DepartmentForm dept, Integer id);


}
