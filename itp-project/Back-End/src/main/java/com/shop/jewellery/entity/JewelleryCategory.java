package com.shop.jewellery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
@Builder
@Audited
@NoArgsConstructor
@AllArgsConstructor
public class JewelleryCategory extends AbstractEntity  {

    @ManyToOne
    @JoinColumn(name="category_id" , referencedColumnName = "id")
    private Category category;

    @ManyToOne
    @JoinColumn(name="jewellery_id" , referencedColumnName = "id")
    private Jewellery jewellery;

}
