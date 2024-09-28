package com.shop.jewellery.model.request.jewelleryCategory;

import com.shop.jewellery.entity.Category;
import com.shop.jewellery.entity.Jewellery;
import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.JewelleryCategory}
 */
@Value
public class JewelleryCategoryRequest implements Serializable {
    UUID id;
    Category category;
    Jewellery jewellery;
}