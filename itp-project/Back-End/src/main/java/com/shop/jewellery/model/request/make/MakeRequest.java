package com.shop.jewellery.model.request.make;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Make}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MakeRequest implements Serializable {
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
    private String customerAddress;
    private String customerNIC;
    private String customerPWord;
    private String customerProfilePicture;
    private String status;
    private double weight;
    private double price;
    private UUID designId;
    private Long designCreatedAt;
    private Long designUpdatedAt;
    private String designName;
    private String designDescription;
    private String designImageUrl;
    private String designPrice;
}