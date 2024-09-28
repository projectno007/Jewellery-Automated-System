package com.shop.jewellery.model.request.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Payment}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paymentrequest implements Serializable {
    private UUID id;
    private Long updatedAt;
    private Double amount;
    private String paymentStatus;
    private LocalDate paymentDate;
}