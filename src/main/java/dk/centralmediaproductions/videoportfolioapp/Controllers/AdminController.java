package dk.centralmediaproductions.videoportfolioapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminOverview() {
        return "adminOverview";
    }

    @RequestMapping(value = "/adminCreateVideo", method = RequestMethod.GET)
    public String adminCreateVideo() {
        return "adminCreateVideo";
    }

    @RequestMapping(value = "/adminUpdateVideo", method = RequestMethod.GET)
    public String adminUpdateVideo() {
        return "adminUpdateVideo";
    }

    @RequestMapping(value = "/adminCreateFoto", method = RequestMethod.GET)
    public String adminCreateFoto() {
        return "adminCreateFoto";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

    @GetMapping("/403")
    public String error403(){
        return "403";
    }

}
