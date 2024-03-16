package com.shop.jewellery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Data
@Audited
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Supplier extends AbstractEntity{

    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String companyName;
    @Column
    private String telephone;
    @Column
    private String status;
    @Column
    private String category;
    @Column
    private String email;
}
