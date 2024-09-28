package com.shop.jewellery.model.request.customerRental;

import com.shop.jewellery.entity.Customer;
import com.shop.jewellery.entity.Rental;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.CustomerRentals}
 */
@Value
public class CustomerRentalsRequest implements Serializable {
    UUID id;
    Customer customer;
    Rental rental;
    LocalDateTime rentalDate;
    LocalDateTime returnDate;
    String status;
}