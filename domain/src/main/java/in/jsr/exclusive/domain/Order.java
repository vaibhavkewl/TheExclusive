package in.jsr.exclusive.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Long id;
    private Date orderDate;
    private Long orderQuantity;
    private Product product;
}
