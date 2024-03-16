package com.noobstack.jewellery.model;

import com.sun.istack.NotNull;
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
@Inheritance(strategy = InheritanceType.JOINED)
public class Jewellery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID jewellery_id;
    private String name;
    private String material;
    private String image_url;
    private Double supplyPrice;

    @ManyToOne
    @NotNull
    private Supplier supplier;

    @OneToOne
    @NotNull
    @JoinColumn(name = "category_id", referencedColumnName = "categoryId")
    private Category category;
}
