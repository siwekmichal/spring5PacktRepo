package org.packt.dissect.mvc.controller;

import org.packt.dissect.mvc.model.form.DepartmentForm;
import org.packt.dissect.mvc.model.form.EmployeeForm;
import org.packt.dissect.mvc.service.DepartmentService;
import org.packt.dissect.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeServiceImpl;

    @RequestMapping("/empForm.html")
    public String initForm(Model model){
        EmployeeForm employeeForm = new EmployeeForm();
        model.addAttribute("employeeForm", employeeForm);
        return "emp_form";
    }

    @RequestMapping(value = "/empForm.html", method = RequestMethod.POST)
    public String submitForm (Model model,
                              @ModelAttribute("employeeForm") EmployeeForm employeeForm){
        employeeServiceImpl.addEmployee(employeeForm);
        model.addAttribute("employees", employeeServiceImpl.readEmployees());
        return "emp_result";

    }

}
