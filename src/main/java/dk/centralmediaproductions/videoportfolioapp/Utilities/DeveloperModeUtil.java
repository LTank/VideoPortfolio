package dk.centralmediaproductions.videoportfolioapp.Utilities;

import org.springframework.ui.Model;

public class DeveloperModeUtil {
    public void setDevelopermode(Model model, boolean developermode) {
        model.addAttribute("developermode", developermode);
    }

    public void disableDevelopermode(Model model) {
        model.addAttribute("developermode", false);
    }
    public void enableDeveloperMode(Model model) {
        model.addAttribute("developermode", true);
    }
}
