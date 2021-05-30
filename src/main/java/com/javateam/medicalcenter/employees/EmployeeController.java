package com.javateam.medicalcenter.employees;

import com.javateam.medicalcenter.employees.application.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

        private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;

    }

    @RequestMapping({"employees"})
    public String getName(Model model) {

        model.addAttribute("employee", employeeService.mockEmployees());

        return "employees";
    }
}



