package dk.centralmediaproductions.videoportfolioapp.Entities;

import javax.persistence.*;


@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long videoId;
    private String title;
    private String description;
    private String videoUrl;
    private String photoUrl;
    private int rankNumber;
    private String genre; //options: "commercials" "live" "music_videos" "short_film"


    public Video() {
    }


    public Video(String title, String description, String videoUrl, String photoUrl, int rankNumber, String genre) {
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.photoUrl = photoUrl;
        this.rankNumber = rankNumber;
        this.genre = genre; //options: "commercials" "live" "music_videos" "short_film"

    }
    public Video(long videoId, String title, String description, String videoUrl, String photoUrl) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.photoUrl = photoUrl;
    }

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getRankNumber() {
        return rankNumber;
    }

    public void setRankNumber(int rankNumber) {
        this.rankNumber = rankNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }
}
