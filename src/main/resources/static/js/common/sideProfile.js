var sideProfile;

$(document).ready(() => {
    sideProfile = $("#side-profile");
    $("#side-profile-close-button").click(function (){
       closeNav();
    });
    $("#side-profile-open-button").click(function () {
        openNav();
    });
});

function openNav() {
    sideProfile.css("width", "100vw");
    sideProfile.removeClass("hide-side-profile");
}

function closeNav() {
    sideProfile.css("width", "0");
    sideProfile.addClass("hide-side-profile");
}