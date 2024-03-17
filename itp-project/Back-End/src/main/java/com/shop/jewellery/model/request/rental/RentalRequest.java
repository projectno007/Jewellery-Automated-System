package com.shop.jewellery.model.request.rental;

import com.shop.jewellery.entity.Jewellery;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.shop.jewellery.entity.Rental}
 */
@Value
public class RentalRequest implements Serializable {
    Long createdAt;
    Long updatedAt;
    Jewellery jewellery;
    double rentalPrice;
}