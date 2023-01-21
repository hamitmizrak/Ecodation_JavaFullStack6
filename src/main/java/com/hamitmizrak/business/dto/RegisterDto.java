package com.hamitmizrak.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

public class RegisterDto {

    private Long id;

    @NotEmpty(message = " adını boş geçilmez")
    private String name;

    @NotEmpty(message = " surname boş geçimezsiniz")
    private String surname;

    @NotEmpty(message = " şifre boş geçimezsiniz")
    @Size(min = 5,max = 14,message = "şifre kodu en az 5 olacak,  en fazla 14 olmalıdır.")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}")
    //@Min(value=18,message="10 küçük rakam giremezsin")
    //@Max(value=100,message="100 büyük rakam giremezsin")
    private String password;

    @NotEmpty(message = "Telefon boş geçilemez")
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$")
    private String telephone;

    @NotEmpty(message = " email Address boş geçimezsiniz")
    @Email(message = " email uygun formatta girmediniz")
    private String email;
}
