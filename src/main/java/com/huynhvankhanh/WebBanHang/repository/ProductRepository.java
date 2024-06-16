package com.huynhvankhanh.WebBanHang.repository;

import com.huynhvankhanh.WebBanHang.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
