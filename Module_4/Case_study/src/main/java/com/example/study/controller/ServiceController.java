package com.example.study.controller;

import com.example.study.model.Customer;
import com.example.study.model.Service;
import com.example.study.repository.RentTypeRepository;
import com.example.study.repository.ServiceRepository;
import com.example.study.service.CustomerService;
import com.example.study.service.RentTypeService;
import com.example.study.service.ServiceService;
import com.example.study.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    ServiceService serviceService;
    @Autowired
    RentTypeService rentTypeService;
    @Autowired
    ServiceTypeService serviceTypeService;
    //    @Autowired
//    CustomerTypeRepository customerTypeRepository;
    @GetMapping("")
    public String showService (Model model){
        model.addAttribute("serviceList", serviceService.findAll());
        model.addAttribute("renTypeList", rentTypeService.findAll());
        model.addAttribute("serviceTypeList", serviceTypeService.findAll());
        return "/service/list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("service",new Service());
        model.addAttribute("renTypeList", rentTypeService.findAll());
        model.addAttribute("serviceTypeList", serviceTypeService.findAll());
//        model.addAttribute("customerType",customerTypeRepository.findAll());
        return "service/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Service service, RedirectAttributes redirectAttributes){
        serviceService.save(service);
        redirectAttributes.addFlashAttribute("message","create success");
        return "redirect:/service";
    }
    @GetMapping("{id}/update")
    public String showUpdate(@PathVariable int id, Model model){
        model.addAttribute("service",serviceService.findById(id));
        model.addAttribute("renTypeList", rentTypeService.findAll());
        model.addAttribute("serviceTypeList", serviceTypeService.findAll());
//        model.addAttribute("customerType",customerTypeRepository.findById(id));
        return "service/edit";
    }
    @PostMapping("/update")
    public String updateService(@ModelAttribute Service service, RedirectAttributes redirectAttributes){
        serviceService.save(service);
        redirectAttributes.addFlashAttribute("message","update success");
        return "redirect:/service";
    }
    @GetMapping("/view")
    public String showServiceById(@PathVariable int id, Model model){
        model.addAttribute("service", serviceService.findById(id));
        return "service/view";
    }
    @GetMapping("/{id}/delete")
    public String deleteCategory(@PathVariable int id, RedirectAttributes redirectAttributes) {
        serviceService.remove(id);
        redirectAttributes.addFlashAttribute("message","Delete Success!!!");
        return "redirect:/service";
    }
}
