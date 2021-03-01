package com.udemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
