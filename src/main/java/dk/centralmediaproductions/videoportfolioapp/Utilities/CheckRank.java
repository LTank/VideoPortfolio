package dk.centralmediaproductions.videoportfolioapp.Utilities;

import com.google.common.collect.Lists;
import dk.centralmediaproductions.videoportfolioapp.Entities.Video;
import dk.centralmediaproductions.videoportfolioapp.Repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class CheckRank {


    public void checkRanking(int rankNumber, VideoRepository vr) {

        ArrayList<Video> videos = Lists.newArrayList(vr.findAll());
        //kør alle videoer igennem
        for (int i = 0; i < videos.size(); i++) {
            //hvis en video har mere eller ligesåmeget som den som kommer ind
            if (videos.get(i).getRankNumber() >= rankNumber) {
                //så plus med en
                videos.get(i).setRankNumber(videos.get(i).getRankNumber() + 1);
            }
        }

        for (int i = 0; i < videos.size(); i++) {
            if (videos.get(i).getRankNumber() > rankNumber) {
                vr.save(videos.get(i));

            }
        }
    }
}
