package com.shop.jewellery.service;

import com.shop.jewellery.entity.Payment;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

public interface IPaymentService {
    List<Payment> getAllPayments();

    ResponseEntity<?> getPaymentById(UUID id);

    ResponseEntity<Payment> addNewPayment(Payment payment) throws URISyntaxException;

    ResponseEntity<?> deletePayment(UUID id);

    List<Payment> getPaymentByPaymentStatus(String paymentstatus);

    ResponseEntity<Payment> updatePayment(Payment payment);
}
