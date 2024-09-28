package com.shop.jewellery.model.response.admin;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.shop.jewellery.entity.Admin}
 */
@Value
public class AdminResponse implements Serializable {
    UUID id;
    String position;
    String NIC;
    String fname;
    String lName;
    String active;
    String password;
    String roles;
    String uname;
}