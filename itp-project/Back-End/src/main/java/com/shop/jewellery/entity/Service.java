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
@Inheritance(strategy = InheritanceType.JOINED)
public class Service extends AbstractEntity{

    @Column
    private String jewelleryType;
    @Column
    private String imageUrl;
    @Column
    private String localDateTime;
    @Column
    private String isEditable;

    @ManyToOne
    private Customer customer;
}
