package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {
    @Autowired
    private ApplicationContext applicationContext;
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String getCars(Model model, @RequestParam(value = "count", required = false) Integer count) {
        CarService bean = applicationContext.getBean(CarService.class);
        model.addAttribute("cars", bean.getCars(count));
        return "cars";
    }
}
