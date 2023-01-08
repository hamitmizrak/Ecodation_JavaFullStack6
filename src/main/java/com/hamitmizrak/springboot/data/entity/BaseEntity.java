package com.hamitmizrak.springboot.data.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//lombok
@Getter
@Setter

//MappedSuperclass
@MappedSuperclass
public class BaseEntity  implements Serializable {
    public static final Long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,insertable = true, nullable = false,unique = true)
    private Long id;

    @Column(name="created_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
}
