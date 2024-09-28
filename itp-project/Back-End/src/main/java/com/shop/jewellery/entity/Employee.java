package com.shop.jewellery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@Audited
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee extends AbstractEntity {

    @Column
    private String position;
    @Column
    private String NIC;
    @Column
    private String fname;
    @Column
    private String lName;

}
