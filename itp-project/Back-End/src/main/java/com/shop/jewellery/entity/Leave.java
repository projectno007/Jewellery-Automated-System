package com.shop.jewellery.entity;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Builder
@Audited
@AllArgsConstructor
@NoArgsConstructor
public class Leave extends AbstractEntity{

    @Column
    private LocalDate leaveFrom;
    @Column
    private LocalDate leaveTo;
    @Column
    private String reason;

    @ManyToOne
    private Employee employee;
}
