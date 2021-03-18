package com.example.customer.controller;

import com.example.customer.entity.ContractDetail;
import com.example.customer.service.impl.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contractDetail")
public class ContractDetailController {
    @Autowired
    ContractDetailService contractDetailService;
    @GetMapping("/")
    public String show(){
        return "/contractDetail/show";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("contractDetail", new ContractDetail());
        return "/contractDetail/create";
    }
}
