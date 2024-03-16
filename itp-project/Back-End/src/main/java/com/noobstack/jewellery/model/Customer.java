package com.noobstack.jewellery.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID customer_id;
    @NotNull
    private String name;
    private String firstName;
    private String lastName;
    private String telephone;
    private String address;
    private String NIC;
    private String PWord;
    private String profilePicture;
}
