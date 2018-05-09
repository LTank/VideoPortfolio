$(document).ready(function() {

    $("#all").click(function () {
        $(".video-link img").fadeTo("slow", 1);
    });

    $("#short_film").click(function () {
        $(".video-link img").not(".short_film img").fadeTo("slow", 0.2);
    });

});