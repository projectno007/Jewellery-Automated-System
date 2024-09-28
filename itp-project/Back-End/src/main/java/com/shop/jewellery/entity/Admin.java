package com.shop.jewellery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Data
@Audited
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends Employee {
    @Column
    private String active;
    @Column
    private String password;
    @Column
    private String roles;
    @Column
    private String uname;
}