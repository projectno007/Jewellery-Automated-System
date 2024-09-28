package com.shop.jewellery.model.request.customer;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.shop.jewellery.entity.Customer}
 */
@Value
@Data
@Builder
@AllArgsConstructor
public class CustomerRequest implements Serializable {
    String name;
    String firstName;
    String lastName;
    String telephone;
    String address;
    String NIC;
    String PWord;
    String profilePicture;
}