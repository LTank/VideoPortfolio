package dk.centralmediaproductions.videoportfolioapp.Utilities;

public class EmbedFactory {

    public String extractUrlFromIframe(String iframe){
        if(!iframe.contains("iframe")){
            return iframe;
        }
        int pos = iframe.indexOf("src=");
        String start = iframe.substring(pos + 5);
        int posquode = start.indexOf("\"");
        String urlString = start.substring(0 , posquode);

        return urlString;
    }
}
