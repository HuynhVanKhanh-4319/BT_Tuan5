package com.huynhvankhanh.WebBanHang.repository;

import com.huynhvankhanh.WebBanHang.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
