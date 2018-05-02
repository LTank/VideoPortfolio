package dk.centralmediaproductions.videoportfolioapp.Utilities;

import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;

public class NavbarUtil {

    public void highlightVideoGrid(Model model) {
        model.addAttribute("page", "VideoGrid");
    }

    public void highlightAlbumGallery(Model model) {
        model.addAttribute("page", "AlbumGallery");
    }

    public void highlightContactsPage(Model model) {
        model.addAttribute("page", "ContactPage");
    }
}
