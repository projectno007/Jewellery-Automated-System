package com.shop.jewellery.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Data
@Builder
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class Record extends AbstractEntity{
    @Column
    private String loginTime;
    @Column
    private String activityTime;
    @Column
    private String activity;

    @ManyToOne
    private Admin admin;
}
