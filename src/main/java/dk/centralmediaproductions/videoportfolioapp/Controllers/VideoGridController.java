package dk.centralmediaproductions.videoportfolioapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VideoGridController {

    @RequestMapping(value = {"/portfolio"}, method = RequestMethod.GET)
    public String showVideoGrid(){
        return "videoGrid";
    }

}
