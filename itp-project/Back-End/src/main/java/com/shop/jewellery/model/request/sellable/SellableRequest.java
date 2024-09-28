package com.shop.jewellery.model.request.sellable;

import com.shop.jewellery.model.request.supplier.SupplierRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Sellable}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellableRequest implements Serializable {
    private UUID id;
    private String name;
    private String material;
    private String image_url;
    private Double supplyPrice;
    private SupplierRequest supplier;
    private double sellPrice;
    private UUID customerId;
}