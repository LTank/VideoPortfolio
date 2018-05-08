package dk.centralmediaproductions.videoportfolioapp.Controllers;

import dk.centralmediaproductions.videoportfolioapp.Utilities.NavbarUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumGalleryController {

    @RequestMapping(value = "/foto", method = RequestMethod.GET)
    public String showAlbumGallery(Model model){

        new NavbarUtil().highlightAlbumGallery(model);

        return "albumGallery";
    }



}
