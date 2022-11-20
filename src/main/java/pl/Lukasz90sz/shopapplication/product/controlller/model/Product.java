package pl.Lukasz90sz.shopapplication.product.controlller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Product {
    private String name;
    private String category;
    private String description;
    private BigDecimal price;
    private String currency;
}
