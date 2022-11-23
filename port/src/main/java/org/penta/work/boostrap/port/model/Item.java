package org.penta.work.boostrap.port.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Long id;

    private String name;

    private BigDecimal price;

    private Boolean veg;

}