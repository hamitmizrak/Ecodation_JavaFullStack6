package com.hamitmizrak.springboot.business.dto;

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

public class ProductDto {

    private Long id;
    @NotEmpty(message = "ürün adını boş geçilmez")
    private String name;

    @NotEmpty(message = "ürün fiyatını boş geçimezsiniz")
    private String price;

    @NotEmpty(message = "ürün codes boş geçimezsiniz")
    @Size(min = 5,max = 7,message = "ürün kodu en az 5 olacak,  en fazla 7 olmalıdır.")
    private String codes;

    @NotEmpty(message = "ürün email Address boş geçimezsiniz")
    @Email(message = "ürün email uygun formatta girmediniz")
    private String emailAddress;
}
