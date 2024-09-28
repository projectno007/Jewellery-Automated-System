package com.shop.jewellery.model.request.supplier;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Supplier}
 */
@Value
public class SupplierRequest implements Serializable {
    UUID id;
    String name;
    String address;
    String companyName;
    String telephone;
    String category;
    String email;
}