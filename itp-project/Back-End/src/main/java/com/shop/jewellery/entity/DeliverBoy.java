package com.shop.jewellery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@SuperBuilder
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class DeliverBoy extends Employee {
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String telephone;

}
