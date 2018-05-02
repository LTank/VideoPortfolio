package dk.centralmediaproductions.videoportfolioapp.Controllers;

import dk.centralmediaproductions.videoportfolioapp.Utilities.NavbarUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VideoGridController {

    @RequestMapping(value = {"/film", "/liks.html", "/", ""}, method = RequestMethod.GET)
    public String showVideoGrid(Model model){

        new NavbarUtil().highlightVideoGrid(model);

        return "VideoGrid";
    }



}
