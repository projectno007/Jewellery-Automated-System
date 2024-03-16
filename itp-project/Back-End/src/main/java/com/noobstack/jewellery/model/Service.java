package com.noobstack.jewellery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID service_id;
    private String jewellerytype;
    private String imageUrl;
    private String localDateTime;
    private String isEditable;

    @ManyToOne
    private Customer customer;
}
