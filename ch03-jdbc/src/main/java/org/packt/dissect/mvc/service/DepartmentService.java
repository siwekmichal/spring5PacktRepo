package org.packt.dissect.mvc.service;

import org.packt.dissect.mvc.model.data.Department;
import org.packt.dissect.mvc.model.form.DepartmentForm;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DepartmentService {
    public List<Department> readDepartments();
    public void addDepartment(DepartmentForm dept);


}
