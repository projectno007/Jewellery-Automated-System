package com.shop.jewellery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@Audited
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category extends AbstractEntity{
    @Column
    private String categoryName;
    @Column
    private String categoryDesc;
    @Column
    private String categoryCommonImageUrl;
}
