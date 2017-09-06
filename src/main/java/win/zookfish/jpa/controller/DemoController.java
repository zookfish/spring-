package win.zookfish.jpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import win.zookfish.jpa.service.DemoService;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;


    @RequestMapping("testjpa")
    @ResponseBody
    public ModelMap getTest() {

        ModelMap model = new ModelMap();
        model.addAttribute("json",demoService.getBy());
        return model;
    }

}
