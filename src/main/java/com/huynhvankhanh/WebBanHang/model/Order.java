package com.huynhvankhanh.WebBanHang.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String address;
    private Long number;
    private String  description;
    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

}