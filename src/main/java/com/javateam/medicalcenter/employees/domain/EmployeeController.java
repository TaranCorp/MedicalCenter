package com.javateam.medicalcenter.employees.domain;

import com.javateam.medicalcenter.employees.infrastructure.MemoryEmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    public MemoryEmployeeRepository memoryEmployeeRepository;

    public EmployeeController(MemoryEmployeeRepository memoryEmployeeRepository) {
        this.memoryEmployeeRepository = memoryEmployeeRepository;
    }

    @RequestMapping("/name")
    public String getName(Model model) {

        model.addAttribute("name", memoryEmployeeRepository.findAll());

        return "name";
    }
}





