package currency.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class currency {

    @RequestMapping(value = "/enterMoney", method = RequestMethod.GET)
    public String showChangeForm() {
        return "enterMoney";
    }
    @RequestMapping(value = "/enterMoney", method = RequestMethod.POST)
    public ModelAndView changeMoney(HttpServletRequest request){

        double money =Double.parseDouble(request.getParameter("vnd"));
        double result = money*20000;
        return new ModelAndView("result","result",result);
    }
}
