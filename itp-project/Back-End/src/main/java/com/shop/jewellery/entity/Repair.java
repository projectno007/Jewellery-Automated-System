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
public class Repair extends Service{

    @Column
    private String itemName;
    @Column
    private String damageType;
    @Column
    private String repairType;
    @Column
    private String currentPrice;
    @Column
    private String description;

}
