
// ister $ ister jQuery
$(document).ready(function () {

    //h2 tag
    $("h2").mouseover(function(){
        $("#parag_id").css("color", "white").css("backgroundColor","black");
    })


    //double click Hide
    $("#button_id_dblclick_hide").dblclick(function () {
        jQuery("#parag_id").hide();
    });

    $("#button_id_dblclick_show").mouseover(function(){
        $("#parag_id").show();
    })

    //click event
    $(".button_class_click").click(() => {
        //CSS
        //css object added important: css camelCase 
        const jqueryObject = {
            "backgroundColor": "black",
            "padding": "1rem",
            "boxShadow": "1px 1px 3px 1px rgba(0,0,0,.8)",
        };
        $("#parag_id")
            .html("html data")
            .css("color", "white").css(jqueryObject);
    });


});