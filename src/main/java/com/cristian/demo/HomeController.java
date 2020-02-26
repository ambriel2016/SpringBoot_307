package com.cristian.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/")
    public String index(Model model){
        // First let's create an employee
        Employee employee = new Employee();
        employee.setName("Stephen Bullock");
        employee.setSsn("555-12-1234");
        Laptop laptop = new Laptop();

        Employee employee1 = new Employee();
        employee1.setName("");
        employee1.setSsn("");
        Laptop laptop1 = new Laptop();

        Employee employee2 = new Employee();
        employee2.setName("");
        employee2.setSsn("");
        Laptop laptop2 = new Laptop();

        Employee employee3 = new Employee();
        employee3.setName("");
        employee3.setSsn("");
        Laptop laptop3 = new Laptop();


        laptop.setBrand("Dell");
        laptop.setModel("Latitude XL");

        laptop.setBrand("");
        laptop.setModel("");

        laptop.setBrand("");
        laptop.setModel("");

        laptop.setBrand("");
        laptop.setModel("");


        employeeRepository.save(employee);
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);

        model.addAttribute("employees", employeeRepository.findAll());
        return "index";
    }
}
