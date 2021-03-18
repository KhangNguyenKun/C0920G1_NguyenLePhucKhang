package com.example.customer.controller;

import com.example.customer.entity.Contract;
import com.example.customer.repository.CustomerTypeRepository;
import com.example.customer.repository.EmployeeRepository;
import com.example.customer.repository.ServiceRepository;
import com.example.customer.service.impl.ContractService;
import com.example.customer.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    ContractService contractService;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    CustomerService customerTypeRepository;
    @Autowired
    ServiceRepository serviceRepository;
    @GetMapping("")
    public String showContract(Model model, Pageable pageable) {
        model.addAttribute("contractList", contractService.findAll());
        model.addAttribute("employeeList", employeeRepository.findAll());
        model.addAttribute("customerList", customerTypeRepository.findAll(pageable));
        model.addAttribute("serviceList", serviceRepository.findAll());
        return "/contract/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model, Pageable pageable) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("employeeList", employeeRepository.findAll());
        model.addAttribute("customerList", customerTypeRepository.findAll(pageable));
        model.addAttribute("serviceList", serviceRepository.findAll());
        return "contract/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Contract contract, RedirectAttributes redirectAttributes) {
        contractService.save(contract);
        redirectAttributes.addFlashAttribute("message", "create success");
        return "redirect:/contract";
    }
    @GetMapping("{id}/delete")
    public String delete(@PathVariable int id){
        contractService.remove(id);
        return "redirect:/contract";

    }
}