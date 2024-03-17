package com.shop.jewellery.model.request.deliveryBoy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.DeliverBoy}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliverBoyRequest implements Serializable {
    private UUID id;
    private String position;
    private String NIC;
    private String fname;
    private String lName;
    private String username;
    private String password;
    private String telephone;
}