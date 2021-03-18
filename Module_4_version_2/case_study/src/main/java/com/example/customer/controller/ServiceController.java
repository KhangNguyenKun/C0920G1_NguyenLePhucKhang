package com.example.customer.controller;

import com.example.customer.entity.Customer;
import com.example.customer.entity.Service;
import com.example.customer.service.impl.RenTypeService;
import com.example.customer.service.impl.ServiceService;
import com.example.customer.service.impl.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    ServiceService serviceService;
    @Autowired
    RenTypeService rentTypeService;
    @Autowired
    ServiceTypeService serviceTypeService;
    //    @Autowired
//    CustomerTypeRepository customerTypeRepository;
    @GetMapping("")
    public String showService (Model model){
        model.addAttribute("serviceList", serviceService.findAll());
        model.addAttribute("renTypeList", rentTypeService.findAll());
        model.addAttribute("serviceTypeList", serviceTypeService.findAll());
        return "/service/show";
    }
    @GetMapping("/createHouse")
    public String showCreate(Model model){
        model.addAttribute("service",new Service());
        model.addAttribute("renTypeList", rentTypeService.findAll());
        model.addAttribute("serviceTypeList", serviceTypeService.findAll());
        return "/service/createHouse";
    }
    @GetMapping("/createRoom")
    public String showCreateRoom(Model model){
        model.addAttribute("service",new Service());
        model.addAttribute("renTypeList", rentTypeService.findAll());
        model.addAttribute("serviceTypeList", serviceTypeService.findAll());
        return "/service/createRoom";
    }
    @GetMapping("/createVilla")
    public String showCreateVilla(Model model){
        model.addAttribute("service",new Service());
        model.addAttribute("renTypeList", rentTypeService.findAll());
        model.addAttribute("serviceTypeList", serviceTypeService.findAll());
        return "/service/createVilla";
    }
    @PostMapping("/saveHouse")
    public String saveHouse(@Valid @ModelAttribute Service service, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){

        if (bindingResult.hasErrors()){
            model.addAttribute("serviceTypeList",serviceTypeService.findAll());
            return "service/createHouse";
        } else {
            serviceService.save(service);
            redirectAttributes.addFlashAttribute("message", "create success");
            return "redirect:/";
        }
    }
    @PostMapping("/saveRoom")
    public String saveRoom(@Valid @ModelAttribute Service service , BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){

        if (bindingResult.hasErrors()){
            model.addAttribute("serviceTypeList",serviceTypeService.findAll());
            return "service/createRoom";
        } else {
            serviceService.save(service);
            redirectAttributes.addFlashAttribute("message", "create success");
            return "redirect:/";
        }
    }
    @PostMapping("/saveVilla")
    public String saveVilla(@Valid @ModelAttribute Service service, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){

        if (bindingResult.hasErrors()){
            model.addAttribute("serviceTypeList",serviceTypeService.findAll());
            return "service/createVilla";
        } else {
            serviceService.save(service);
            redirectAttributes.addFlashAttribute("message", "create success");
            return "redirect:/";
        }
    }
    @GetMapping("{id}/update")
    public String showUpdate(@PathVariable String id, Model model){
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
    public String showServiceById(@PathVariable String id, Model model){
        model.addAttribute("service", serviceService.findById(id));
        return "service/view";
    }
    @GetMapping("/delete")
    public String deleteCategory(@RequestParam String id, RedirectAttributes redirectAttributes) {
        serviceService.remove(id);
        redirectAttributes.addFlashAttribute("message","Delete Success!!!");
        return "redirect:/service";
    }
}
