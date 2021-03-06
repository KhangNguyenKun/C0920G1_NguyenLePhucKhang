package com.example.study.controller;

import com.example.study.model.Customer;
import com.example.study.model.Employee;
import com.example.study.repository.DivisionRepository;
import com.example.study.repository.EducationDegreeRepository;
import com.example.study.repository.PositionRepository;
import com.example.study.repository.UserRepository;
import com.example.study.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    PositionService positionService;
    @Autowired
    EducationDegreeService educationDegreeRepository;
    @Autowired
    DivisionService divisionRepository;
    @Autowired
    UserService userRepository;
    //    @Autowired
//    CustomerTypeRepository customerTypeRepository;
    @GetMapping({"", "/list"})
    public String listEmployee(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 3) Pageable pageable) {
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("employeeList", employeeService.findAll(pageable));
            return "/employee/list";
        } else {
            keywordOld = keyword.get();
            model.addAttribute("employeeList", employeeService.findAllInputText(keywordOld, pageable));
            model.addAttribute("keywordOld", keywordOld);
            return "/employee/list";
        }
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("positionList", positionService.findAll());
        model.addAttribute("employee",new Employee());
        model.addAttribute("educationDegree", educationDegreeRepository.findAll());
        model.addAttribute("divisionList", divisionRepository.findAll());
        model.addAttribute("userList", userRepository.findAll());
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
        model.addAttribute("employee",employeeService.findById(id));
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
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam int id, RedirectAttributes redirectAttributes) {
        employeeService.remove(id);
//        redirectAttributes.addFlashAttribute("message","Delete Success!!!");
        return "redirect:/employee";
    }
}
