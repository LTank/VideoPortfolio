package dk.centralmediaproductions.videoportfolioapp.Controllers;

import dk.centralmediaproductions.videoportfolioapp.Repositories.VideoGridRepository;
import dk.centralmediaproductions.videoportfolioapp.Utilities.NavbarUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class VideoGridController {

    @Autowired
    VideoGridRepository videoGridRepository;

    @RequestMapping(value = {"/film", "/liks.html", "/", ""}, method = RequestMethod.GET)
    public String showVideoGrid(Model model){

        new NavbarUtil().highlightVideoGrid(model);
        model.addAttribute("videos", videoGridRepository.readAllVideos());

        return "VideoGrid";
    }



}
