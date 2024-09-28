package com.shop.jewellery.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@SuperBuilder
@Audited
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Jewellery extends AbstractEntity {

    @Column
    private String name;
    @Column
    private String material;
    @Column
    private String image_url;
    @Column
    private Double supplyPrice;

    @ManyToOne
    @NotNull
    private Supplier supplier;

    @OneToMany(mappedBy = "jewellery")
    private List<JewelleryCategory> jewelleryCategories=new ArrayList<>();
}
