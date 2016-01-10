package in.jsr.exclusive.domain;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String userName;
    private String password;

    private String firstName;
    private String middleName;
    private String lastName;

    private String phoneNumber;
}
