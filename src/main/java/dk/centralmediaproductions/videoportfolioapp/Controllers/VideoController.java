package dk.centralmediaproductions.videoportfolioapp.Controllers;

import com.google.common.collect.Lists;
import dk.centralmediaproductions.videoportfolioapp.Entities.Video;
import dk.centralmediaproductions.videoportfolioapp.Repositories.VideoRepository;
import dk.centralmediaproductions.videoportfolioapp.Utilities.CheckRank;
import dk.centralmediaproductions.videoportfolioapp.Utilities.DeveloperModeUtil;
import dk.centralmediaproductions.videoportfolioapp.Utilities.EmbedFactory;
import dk.centralmediaproductions.videoportfolioapp.Utilities.NavbarUtil;
import dk.centralmediaproductions.videoportfolioapp.Utilities.SortByRank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;


@Controller
public class VideoController {

    private boolean developermode = false;


    EmbedFactory embedFactory = new EmbedFactory();

    @Autowired
    VideoRepository videoRepository;

    @RequestMapping(value = "/addVideo", method = RequestMethod.POST)
    public String addVideo(@RequestParam String title,
                           @RequestParam String description,
                           @RequestParam String videoUrl,
                           @RequestParam String photoUrl,
                           @RequestParam int rankNumber,
                           @RequestParam String genre,
                           @RequestParam String director,
                           @RequestParam String production,
                           @RequestParam String equipment){

        String embeddedUrl = embedFactory.extractUrlFromIframe(videoUrl);
        Video video = new Video(title, description, embeddedUrl, photoUrl, rankNumber, genre, director, production, equipment);
        videoRepository.save(video);
        System.out.println("Succesfully saved video to database");
        return "redirect:/adminVideoGrid";
    }

    @RequestMapping(value = "/removeVideo", method = RequestMethod.POST)
    public String removeVideo(@RequestParam long videoId) {
        Optional<Video> video = videoRepository.findById(videoId);
        videoRepository.delete(video.get());
        System.out.println("Succesfully deleted video from database");
        return "redirect:/adminVideoGrid";
    }

    @RequestMapping(value = "/updateVideo", method = RequestMethod.POST)
    public String updateVideo(
            @RequestParam long videoId,
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String videoUrl,
            @RequestParam String photoUrl,
            @RequestParam int rankNumber,
            @RequestParam String genre,
            @RequestParam String director,
            @RequestParam String production,
            @RequestParam String equipment) {

        Optional<Video> optionalVideo = videoRepository.findById(videoId);

        String embeddedUrl = embedFactory.extractUrlFromIframe(videoUrl);
        Video video = new Video(title, description, embeddedUrl, photoUrl, rankNumber, genre, director, production, equipment);
        video.setVideoId(optionalVideo.get().getVideoId());

        //check om rankNumber er optaget og lav plads hvis det ikke er
        new CheckRank().checkRanking(rankNumber, videoRepository);

        videoRepository.save(video);

        return "redirect:/adminVideoGrid";
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showVideoGrid(Model model){
        new NavbarUtil().highlightVideoGrid(model);
        new DeveloperModeUtil().setDevelopermode(model, developermode);
        //sorterer liste
        //ArrayList<Video> listSortedByRank = new SortByRank().getListByRank(videoRepository.findAll());
        ArrayList<Video> rankList = Lists.newArrayList(videoRepository.findAll());

        Collections.sort(rankList, Comparator.comparing(s -> s.getRankNumber()));
        model.addAttribute("videos", rankList);
        return "videoGrid";
    }

    @RequestMapping(value = "/video", method = RequestMethod.GET)
    public String viewVideo(@RequestParam long videoId, Model model){
        Optional<Video> video = videoRepository.findById(videoId);
        model.addAttribute("thisVideo", video.get());
        return "video";
    }

    @RequestMapping(value = "/adminVideoGrid", method = RequestMethod.GET)
    public String showAdminVideoGrid(Model model){
        new NavbarUtil().highlightVideoGrid(model);
        new DeveloperModeUtil().setDevelopermode(model, developermode);

        ArrayList<Video> rankList = Lists.newArrayList(videoRepository.findAll());

        Collections.sort(rankList, Comparator.comparing(s -> s.getRankNumber()));
        model.addAttribute("videos", rankList);
        return "adminVideoGrid";
    }

}
