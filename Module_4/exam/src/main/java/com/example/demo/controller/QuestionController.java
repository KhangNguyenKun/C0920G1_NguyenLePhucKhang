package com.example.demo.controller;


import com.example.demo.model.Question;
import com.example.demo.model.QuestionType;
import com.example.demo.service.QuestionService;
import com.example.demo.service.QuestionTypeService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionTypeService questionTypeService;
    @Autowired
    QuestionService questionService;
    @Autowired
    UserService userService;
    @GetMapping({"", "/list"})
    public String listQuestion(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 3) Pageable pageable) {
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("questionList", questionService.findAll(pageable));
            return "/question/list";
        } else {
            keywordOld = keyword.get();
            model.addAttribute("questionList", questionService.findAllInputText(keywordOld, pageable));
            model.addAttribute("keywordOld", keywordOld);
            return "/question/list";
        }
    }
    //    @GetMapping({"", "/list"})
//    public String listCustomer(Model model, @PageableDefault(value = 3) Pageable pageable) {
//            model.addAttribute("customerList", customerService.findAll(pageable));
//            return "/customer/list";
//    }
    @GetMapping("/create")
    public String showCreateForm(Model model, Pageable pageable){
        model.addAttribute("question",new Question());
//        model.addAttribute("questionType",questionTypeService.findAll());
//        model.addAttribute("user",userService.findAll());
        return "question/create";
    }
    @PostMapping("/save")
    public String save (@ModelAttribute Question question , RedirectAttributes redirectAttributes, Model model){
//        new Customer().validate(customer, bindingResult);
//        if (bindingResult.hasErrors()){
//            model.addAttribute("questionType",questionTypeService.findAll());
//            return "question/create";
//        } else {
            questionService.save(question);
//            redirectAttributes.addFlashAttribute("message", "create success");
            return "redirect:/question";

    }
    @GetMapping("{id}/update")
    public String showUpdate(@PathVariable int id, Model model){
        model.addAttribute("questionList",questionService.findById(id));
        model.addAttribute("questionTypeList",questionTypeService.findAll());
        return "question/edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Question question, RedirectAttributes redirectAttributes){
        questionService.save(question);
        redirectAttributes.addFlashAttribute("message","update success");
        return "redirect:/question";
    }
//    @GetMapping("/view")
//    public String showCategoryById(@PathVariable int id, Model model){
//        model.addAttribute("customer", customerService.findById(id));
//        return "customer/view";
//    }
    @GetMapping("/delete")
    public String deleteQuestion(@RequestParam int id, RedirectAttributes redirectAttributes) {
        questionService.remove(id);
        redirectAttributes.addFlashAttribute("message","Delete Success!!!");
        return "redirect:/question";
    }
}
