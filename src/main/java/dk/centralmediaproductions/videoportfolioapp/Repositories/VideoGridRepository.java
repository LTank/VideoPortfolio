package dk.centralmediaproductions.videoportfolioapp.Repositories;

import dk.centralmediaproductions.videoportfolioapp.Entities.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class VideoGridRepository {
    @Autowired
    private JdbcTemplate jdbc;

    public ArrayList<Video> readAllVideos() {
        SqlRowSet rs = jdbc.queryForRowSet("SELECT * FROM video");

        ArrayList<Video> videos = new ArrayList<>();
        while (rs.next()){
            videos.add(new Video(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getString("video_url"),
                    rs.getString("photo_url")
            ));
        }
        return videos;
    }

}
