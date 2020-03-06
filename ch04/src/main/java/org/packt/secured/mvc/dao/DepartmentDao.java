package org.packt.secured.mvc.dao;

import org.packt.secured.mvc.model.data.Department;

import java.util.List;

public interface DepartmentDao {
    public List<Department> getDepartments();
    public Department getDepartmentData(Integer id);
    public void addDepartmentBySJI(Department dept);
    public void addDepartmentByJT(Department dept);
    public void updateDepartment(Department dept);
    public void delDepartment(Integer id);
}
