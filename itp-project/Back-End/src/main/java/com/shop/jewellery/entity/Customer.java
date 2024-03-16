package com.shop.jewellery.entity;

import com.sun.istack.NotNull;
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
@Table
public class Customer extends AbstractEntity {


    @NotNull
    @Column
    private String name;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String telephone;
    @Column
    private String address;
    @Column
    private String NIC;
    @Column
    private String PWord;
    @Column
    private String profilePicture;
}
