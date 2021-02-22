package com.example.study.controller;

import com.example.study.model.Contract;
import com.example.study.model.Customer;
import com.example.study.repository.ContractDetailRepository;
import com.example.study.repository.CustomerTypeRepository;
import com.example.study.repository.EmployeeRepository;
import com.example.study.repository.ServiceRepository;
import com.example.study.service.ContractService;
import com.example.study.service.CustomerService;
import com.example.study.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    ContractService contractService;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Autowired
    ServiceRepository serviceRepository;
    @GetMapping("")
    public String showContract(Model model) {
        model.addAttribute("contractList", contractService.findAll());
        model.addAttribute("employeeList", employeeRepository.findAll());
        model.addAttribute("customerList", customerTypeRepository.findAll());
        model.addAttribute("serviceList", serviceRepository.findAll());
        return "/contract/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("employeeList", employeeRepository.findAll());
        model.addAttribute("customerList", customerTypeRepository.findAll());
        model.addAttribute("serviceList", serviceRepository.findAll());
        return "contract/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Contract contract, RedirectAttributes redirectAttributes) {
        contractService.save(contract);
        redirectAttributes.addFlashAttribute("message", "create success");
        return "redirect:/contract";
    }
}