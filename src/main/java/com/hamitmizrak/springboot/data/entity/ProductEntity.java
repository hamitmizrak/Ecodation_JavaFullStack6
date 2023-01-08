package com.hamitmizrak.springboot.data.entity;

import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
@RequiredArgsConstructor //for inject

//Entity
@Entity
@Table(name="product")
public class ProductEntity extends BaseEntity implements Serializable {
    public static final Long serialVersionUID=1L;

    @Column(name="product_name",length = 100,columnDefinition = "varchar(255) default 'ürün adını girmediniz' ")
    private String name;

    @Column(name="product_price")
    private String price;

    //Javada olsun ama database kaydetmesin
    @Transient
    private String justJavaData;

    @Lob
    private String bigData;
}
