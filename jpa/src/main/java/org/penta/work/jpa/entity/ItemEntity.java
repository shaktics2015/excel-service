package org.penta.work.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "CAT_ITEM")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "ID")
    private Long id;

//    @Column(unique=true)
    private Boolean veg;

    private String name;

    private BigDecimal price;
}
