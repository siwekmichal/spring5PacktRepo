package org.packt.dissect.mvc.service.impl;

import org.packt.dissect.mvc.dao.DepartmentDao;
import org.packt.dissect.mvc.model.data.Department;
import org.packt.dissect.mvc.model.form.DepartmentForm;
import org.packt.dissect.mvc.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDaoImpl;

    @Override
    public List<Department> readDepartments() {
        return departmentDaoImpl.getDepartments();
    }

    @Override
    public void addDepartment(DepartmentForm dept) {
        Department deptData = new Department();
        deptData.setDeptId(dept.getDeptId());
        deptData.setName(dept.getName());
        departmentDaoImpl.addDepartmentBySJI(deptData);
    }


}
