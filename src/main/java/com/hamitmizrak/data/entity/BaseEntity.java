package com.hamitmizrak.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//lombok
@Getter
@Setter

//Auditing

@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "created_date,updated_dated" })


//MappedSuperclass
@MappedSuperclass
abstract public class BaseEntity  implements Serializable {
    public static final Long serialVersionUID=1L;

    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,insertable = true, nullable = false,unique = true)
    private Long id;

    //systemCreatedDate
    @Column(name="system_created_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemCreatedDate;

    //audit
    //Kim oluşturdu
   @CreatedBy
    @Column(name="created_user")
    private String createdBy;

    //Kim ne zaman oluşturdu
    @Column(name="created_user_date")
    @CreatedDate
    private Date createdUserDate;

    //Kim güncelledi
    @LastModifiedBy
    @Column(name="updated_user")
    private String updatedBy;

    //Kim ne zaman oluşturdu
    @Column(name="updated_user_date")
    @LastModifiedDate
    private Date updatedUserDate;
}
