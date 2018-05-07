package dk.centralmediaproductions.videoportfolioapp.Entities;

import javax.persistence.*;


@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int videoId;
    private String title;
    private String description;
    private String videoUrl;
    private String photoUrl;


    public Video() {
    }

    public Video(String title, String description, String videoUrl, String photoUrl) {
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.photoUrl = photoUrl;
    }
    public Video(int videoId, String title, String description, String videoUrl, String photoUrl) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.photoUrl = photoUrl;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
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
