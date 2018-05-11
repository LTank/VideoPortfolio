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
    private String director;
    private String production;
    private String equipment;

    public Video() {
    }


    public Video(String title, String description, String videoUrl, String photoUrl, int rankNumber, String genre, String director, String production, String equipment) {
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.photoUrl = photoUrl;
        this.rankNumber = rankNumber;
        this.genre = genre;
        this.director = director;
        this.production = production;
        this.equipment = equipment;//options: "commercials" "live" "music_videos" "short_film"

    }
    public Video(long videoId, String title, String description, String videoUrl, String photoUrl) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.photoUrl = photoUrl;
    }

    public Video(long videoId, String title, String description, String videoUrl, String photoUrl, int rankNumber, String genre, String director, String production, String equipment) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.photoUrl = photoUrl;
        this.rankNumber = rankNumber;
        this.genre = genre;
        this.director = director;
        this.production = production;
        this.equipment = equipment;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
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
                ", rankNumber=" + rankNumber +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", production='" + production + '\'' +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}
