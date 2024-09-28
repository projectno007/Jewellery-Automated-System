package com.shop.jewellery.model.request.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Service}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRequest implements Serializable {
    private UUID id;
    private String jewelleryType;
    private String imageUrl;
    private String localDateTime;
    private String isEditable;
    private UUID customerId;
    private String customerName;
    private String customerFirstName;
    private String customerLastName;
    private String customerTelephone;
}