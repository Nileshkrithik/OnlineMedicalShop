package com.mshop.restapi.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mshop.restapi.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
