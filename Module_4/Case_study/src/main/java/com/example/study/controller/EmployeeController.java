package com.example.study.controller;

import com.example.study.model.Customer;
import com.example.study.model.Employee;
import com.example.study.service.CustomerService;
import com.example.study.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    //    @Autowired
//    CustomerTypeRepository customerTypeRepository;
    @GetMapping("")
    public String showCustomer(Model model){
        model.addAttribute("employeeList", employeeService.findAll());
        return "/employee/list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("employee",new Employee());
//        model.addAttribute("customerType",customerTypeRepository.findAll());
        return "employee/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes){
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message","create success");
        return "redirect:/employee";
    }
    @GetMapping("{id}/update")
    public String showUpdate(@PathVariable int id, Model model){
        model.addAttribute("customer",employeeService.findById(id));
//        model.addAttribute("customerType",customerTypeRepository.findById(id));
        return "employee/edit";
    }
    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes){
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message","update success");
        return "redirect:/employee";
    }
    @GetMapping("/view")
    public String showEmployeeById(@PathVariable int id, Model model){
        model.addAttribute("employee", employeeService.findById(id));
        return "employee/view";
    }
    @GetMapping("/{id}/delete")
    public String deleteEmployee(@PathVariable int id, RedirectAttributes redirectAttributes) {
        employeeService.remove(id);
        redirectAttributes.addFlashAttribute("message","Delete Success!!!");
        return "redirect:/employee";
    }
}
