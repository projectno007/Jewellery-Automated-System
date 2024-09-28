package com.shop.jewellery.model.request.repair;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Repair}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RepairRequest implements Serializable {
    private UUID id;
    private String jewelleryType;
    private String imageUrl;
    private String localDateTime;
    private String isEditable;
    private CustomerDto customer;
    private String itemName;
    private String damageType;
    private String repairType;
    private String currentPrice;
    private String description;

    /**
     * DTO for {@link com.shop.jewellery.entity.Customer}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CustomerDto implements Serializable {
        private UUID id;
        private String lastName;
        private String telephone;
    }
}