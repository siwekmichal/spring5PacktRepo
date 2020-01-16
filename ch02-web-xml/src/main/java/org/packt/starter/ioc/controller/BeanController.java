package org.packt.starter.ioc.controller;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.packt.starter.ioc.model.Department;
import org.packt.starter.ioc.model.Employee;
import org.packt.starter.ioc.model.ListEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
public class BeanController {

    @Autowired
    @Qualifier(value = "empRec2")
    private Employee empRecs;

    @Inject
    private Department dept2;

    @Resource(name="listEmployees")
    private ListEmployees listEmps;

}
