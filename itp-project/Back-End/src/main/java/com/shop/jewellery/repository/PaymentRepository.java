package com.shop.jewellery.repository;

import com.shop.jewellery.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {
    List<Payment> findByPaymentStatus(String paymentStatus);
}
