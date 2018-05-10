$(document).ready(function() {

    var everything = $(".row, .video-link img");

    var allBtn =  $("#all, #music_videos, #short_film, #live, #commercials");

    var allVideosBtn = $("#all");
    var allVideos = $(".video-link img");

    var commercialsBtn = $("#commercials");
    var commercials = $(".commercials img");
    var not_commercials = $(".video-link:not(.commercials) img");

    var liveBtn = $("#live");
    var live = $(".live img");
    var not_live = $(".video-link:not(.live) img");

    var short_filmBtn = $("#short_film");
    var short_film = $(".short_film img");
    var not_short_film = $(".video-link:not(.short_film) img");

    var music_videosBtn = $("#music_videos");
    var music_videos = $(".music_videos img");
    var not_music_videos = $(".video-link:not(.music_videos) img");

    allVideosBtn.addClass("active");
    everything.fadeTo("slow", 1).delay(500);



    allVideosBtn.click(function () {
        allBtn.removeClass("active");
        allVideosBtn.addClass("active");
        allVideos.fadeTo("fast", 1);
    });

    commercialsBtn.click(function () {
        allBtn.removeClass("active");
        commercialsBtn.addClass("active");
        not_commercials.fadeTo("fast", 0.1);
        commercials.fadeTo("fast", 1);
    });

    liveBtn.click(function () {
        allBtn.removeClass("active");
        liveBtn.addClass("active");
        not_live.fadeTo("fast", 0.1);
        live.fadeTo("fast", 1);
    });

    short_filmBtn.click(function () {
        allBtn.removeClass("active");
        short_filmBtn.addClass("active");
        not_short_film.fadeTo("fast", 0.1);
        short_film.fadeTo("fast", 1);
    });

    music_videosBtn.click(function () {
        allBtn.removeClass("active");
        music_videosBtn.addClass("active");
        not_music_videos.fadeTo("fast", 0.1);
        music_videos.fadeTo("fast", 1);
    });

});