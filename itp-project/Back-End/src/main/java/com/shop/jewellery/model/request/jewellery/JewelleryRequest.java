package com.shop.jewellery.model.request.jewellery;

import com.shop.jewellery.entity.JewelleryCategory;
import com.shop.jewellery.entity.Supplier;
import lombok.Value;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Jewellery}
 */
@Value
public class JewelleryRequest implements Serializable {
    UUID id;
    String name;
    String material;
    String image_url;
    Double supplyPrice;
    Supplier supplier;
    List<JewelleryCategory> jewelleryCategories;
}