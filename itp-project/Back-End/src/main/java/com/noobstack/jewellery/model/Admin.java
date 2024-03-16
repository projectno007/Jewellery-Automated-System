package com.noobstack.jewellery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Admin extends Employee{

    private String active;
    private String password;
    private String roles;
    private String uname;


//    @Override
//    public String toString() {
//        return "Admin{" +
//                "active='" + active + '\'' +
//                ", password='" + password + '\'' +
//                ", roles='" + roles + '\'' +
//                ", uname='" + uname + '\'' +
//                '}';
//    }
}