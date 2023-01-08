package com.hamitmizrak.springboot.data.repository;

import com.hamitmizrak.springboot.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<ProductEntity,Long> {
    //delivered Query
}
