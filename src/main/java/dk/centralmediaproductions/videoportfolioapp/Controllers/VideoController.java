package dk.centralmediaproductions.videoportfolioapp.Controllers;

import dk.centralmediaproductions.videoportfolioapp.Entities.Video;
import dk.centralmediaproductions.videoportfolioapp.Repositories.VideoGridRepository;
import dk.centralmediaproductions.videoportfolioapp.Repositories.VideoRepository;
import dk.centralmediaproductions.videoportfolioapp.Utilities.DeveloperModeUtil;
import dk.centralmediaproductions.videoportfolioapp.Utilities.NavbarUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class VideoController {


    @Autowired
    VideoRepository videoRepository;

    @RequestMapping(value = "/addFilm", method = RequestMethod.GET)
    public String addVideo(@RequestParam String title,
                           @RequestParam String description,
                           @RequestParam String videoUrl,
                           @RequestParam String photoUrl){

        Video video = new Video(title, description, videoUrl, photoUrl);
        System.out.println(video.getTitle() + " " + video.getDescription());
        videoRepository.save(video);
        return "saved";
    }



}
