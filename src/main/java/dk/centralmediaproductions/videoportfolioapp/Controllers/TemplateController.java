package dk.centralmediaproductions.videoportfolioapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TemplateController {

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public String showTemplate(Model model){
        model.addAttribute("controllerTest", true);
        return "template";
    }


}
