
// auto Complete
const autoComplete = () => {
    let search_array = ["action", "blog", "class", "define", "java", "javacript"];
    $("#tags").autocomplete({
        source: search_array
    });
}
autoComplete()


// dark Light
//butona tıkladığımda css eklesin
const darkLight = () => {
    document.body.classList.toggle("dark_mode");
}
darkLight()


// Register validation
const registerValidation = () => {
    $("#btnSubmit").click(() => {
        let username, email, password;
        username = jQuery.trim($("#username").val());
        email = jQuery.trim($("#email").val());
        password = jQuery.trim($("#password").val());


        const validate = {
            "background-color": "blue",
            "color": "white"
        };

        //USERNAME
        if (username == "") {
            $("#validation_username").html("Kullanıcı adı boş geçilemez");
            $("#username").css(validate);
        }

        //PASSWORD
        if (password == "") {
            $("#validation_password").html("Kullanıcı Şifresi boş geçilemez");
            $("#password").css(validate);
        } else if (regexPassword(password) == false) {
            $("#validation_password").html("Uygun formatta şifre girilmedi");
        }
        function regexPassword(password) {
            const regex = /^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
            return regex.test(password);
        }

        //EMAIL
        if (email == "") {
            $("#validation_email").html("Email boş geçilemez");
            $("#email").css(validate);
        } else if (regexEmail(email) == false) {
            $("#validation_email").html("Uygun formatta email girilmedi ör: deneme@xyz.com");

        }
        function regexEmail(email) {
            const regex = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
            return regex.test(email);
        };
    }) //end registerValidation
}
registerValidation()


// Footer Date
const date_now = new Date().getFullYear();
$("#copy_date").html(date_now)


