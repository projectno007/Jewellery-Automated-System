package com.shop.jewellery.model.request.admin;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminRequest {


    String position;
    String NIC;
    String fname;
    String lName;
    String active;
    String password;
    String roles;
    String uname;
}
