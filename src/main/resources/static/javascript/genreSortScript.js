$(document).ready(function() {

    var allVideos = $(".video-link img");

    var commercials = $(".commercials img");
    var not_commercials = $(".video-link:not(.commercials) img");

    var live = $(".live img");
    var not_live = $(".video-link:not(.live) img");

    var short_film = $(".short_film img");
    var not_short_film = $(".video-link:not(.short_film) img");

    var music_videos = $(".music_videos img");
    var not_music_videos = $(".video-link:not(.music_videos) img");


    $("#all").click(function () {
        allVideos.fadeTo("fast", 1);
    });

    $("#commercials").click(function () {
        not_commercials.fadeTo("fast", 0.1);
        commercials.fadeTo("fast", 1);
    });

    $("#live").click(function () {
        not_live.fadeTo("fast", 0.1);
        live.fadeTo("fast", 1);
    });

    $("#short_film").click(function () {
        not_short_film.fadeTo("fast", 0.1);
        short_film.fadeTo("fast", 1);
    });

    $("#music_videos").click(function () {
        not_music_videos.fadeTo("fast", 0.1);
        music_videos.fadeTo("fast", 1);
    });

});