package org.packt.starter.ioc.model.test;

import org.packt.starter.ioc.context.BeanConfig;
import org.packt.starter.ioc.model.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

public class TestInjectData {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);

        System.out.println("application context loaded");
        context.refresh();

        ListEmployees listEmps = context.getBean("listEmployees", ListEmployees.class);

        List<Employee> empRecs = listEmps.getListEmps();
        Iterator<Employee> iterate = empRecs.iterator();
        System.out.println("\n*********Injected List of Employee record ***************");
        while (iterate.hasNext()){
            Employee emp = iterate.next();
            System.out.format("%s %s %d \n", emp.getFirstName(), emp.getLastName(), emp.getAge());
        }

        System.out.println("\n*********Injected List of Employee Names ***************");
        List<String> empNames = listEmps.getListEmpNames();
        Iterator<String> iterateStr = empNames.iterator();
        while (iterateStr.hasNext()){
            String empName = iterateStr.next();
            System.out.format("%s \n", empName);
        }

        System.out.println("\n*********Injected Set of Department record ***************");
        SetDepartments setDepts = context.getBean("setDepartments", SetDepartments.class);
        Set<Department> deptRevs = setDepts.getSetDepts();
        Iterator<Department> iterateDept = deptRevs.iterator();
        while (iterateDept.hasNext()){
            Department dept = iterateDept.next();
            System.out.format("%d  %s\n", dept.getDeptNo(), dept.getDeptName());
        }

        System.out.println("\n*********Injected Set of Department names ***************");
        Set<String> deptNames = setDepts.getDeptNames();
        Iterator<String> deptNameIterate = deptNames.iterator();
        while (deptNameIterate.hasNext()){
            String deptName = deptNameIterate.next();
            System.out.format("%s\n", deptName);
        }

        System.out.println("\n*********Injected Task and Employee Mapping ***************");
        MapEmpTasks empTasks = context.getBean("mapEmpTasks", MapEmpTasks.class);
        Map<String, Employee> assignTasked = empTasks.getMapEmpTask();
        Iterator<Map.Entry<String, Employee>> tasksIterate = assignTasked.entrySet().iterator();
        while (tasksIterate.hasNext()){
            Map.Entry<String, Employee> taks = tasksIterate.next();
            String key = taks.getKey();
            Employee value = taks.getValue();
            System.out.format("Task: %s = %s %s \n", key, value.getFirstName(), value.getLastName());
        }

        System.out.println("\n*********Injected Task and Manager Mapping ***************");
        Map<String, String> assignMgr = empTasks.getMapEmpMgr();
        Iterator<Map.Entry<String, String>> mgrIterate = assignMgr.entrySet().iterator();
        while (mgrIterate.hasNext()){
            Map.Entry<String, String> taskMgr = mgrIterate.next();
            String key = taskMgr.getKey();
            String value = taskMgr.getValue();
            System.out.format("Manager: %s = %s\n", key, value);
        }

        System.out.println("\n*********Injected Audition Data ***************");
        PropertiesAudition auditionInfo = context.getBean("propertiesAudition", PropertiesAudition.class);
        Properties propsAddress = auditionInfo.getAuditionAddress();
        System.out.format("Audition Address: %s  %s   %s  %s\n", propsAddress.getProperty("building"), propsAddress.getProperty("city"),
                propsAddress.getProperty("country"), propsAddress.getProperty("zipcode"));
        Properties propsReqt = auditionInfo.getAuditionRequirement();
        System.out.format("Audition Requirements: Call time @ %s  bring %s and  %s  \n", propsReqt.getProperty("time"),
                propsReqt.getProperty("document"), propsReqt.getProperty("picture"));


        context.registerShutdownHook();
    }
}
