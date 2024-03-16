package com.noobstack.jewellery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Design {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID design_id;
    private String name;
    private String description;
    private String imageUrl;
    private String price;


}
