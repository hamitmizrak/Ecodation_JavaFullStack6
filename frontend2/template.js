
// auto Complete
let autoComplete = () => {
    let search_array = ["action", "blog", "class", "define", "java", "javacript"];
    $("#tags").autocomplete({
        source: search_array
    });
}
autoComplete()


// dark Light
//butona tıkladığımda css eklesin
let darkLight = () => {
    document.body.classList.toggle("dark_mode");
}
darkLight()



