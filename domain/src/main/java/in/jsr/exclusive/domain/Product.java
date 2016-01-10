package in.jsr.exclusive.domain;

import lombok.Data;

/**
 * Created by vaibansa on 10.01.16.
 */
@Data
public class Product {

    private Long id;
    private String name;
    private String description;
    private boolean availability;
    private byte[] image;
}
