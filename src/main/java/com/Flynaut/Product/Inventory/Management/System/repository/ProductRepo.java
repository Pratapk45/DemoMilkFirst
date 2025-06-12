package com.Flynaut.Product.Inventory.Management.System.repository;

import com.Flynaut.Product.Inventory.Management.System.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
