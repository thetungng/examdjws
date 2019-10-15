package com.example.demo.Controller;

import com.example.demo.Service.EmployeesService.Employees;
import com.example.demo.Service.EmployeesService.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/employees")
public class EmployeesController {

    @Autowired
    EmployeesService employeesService;

    @GetMapping(value = "/list")
    public String listEmployee(Model model) throws RemoteException {
        model.addAttribute("list", employeesService.getAll());
        return "list";
    }

    @GetMapping(value = "/add")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employees());
        return "form";
    }

    @PostMapping(value = "/add")
    public String addEmployee(Employees employee) throws RemoteException {
        employeesService.store(employee);
        return "redirect:/employees/list";
    }

    @GetMapping(value = "/edit/{id}")
    public String showupdateForm(@PathVariable("id") long id, Model model) throws RemoteException {
        Employees employee = employeesService.getById(id);
        model.addAttribute("employee", employee);
        return "edit";
    }

    @PostMapping(value = "/update")
    public String updateEmp(Employees employee) throws RemoteException {
        employeesService.update(employee);
        return "redirect:/employees/list";
    }
}