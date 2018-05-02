package dk.centralmediaproductions.videoportfolioapp.Controllers;

import dk.centralmediaproductions.videoportfolioapp.Utilities.NavbarUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactPageController {

    @RequestMapping(value = {"/kontakt"}, method = RequestMethod.GET)
    public String showContactPage(Model model){

        new NavbarUtil().highlightContactsPage(model);

        return "ContactPage";
    }



}
