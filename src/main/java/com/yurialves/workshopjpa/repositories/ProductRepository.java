package com.yurialves.workshopjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurialves.workshopjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
