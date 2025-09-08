package com.ecommerce.user.dto;

import lombok.Data;

@Data
public class UserRequestDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phone;
    private AddressDTO address;

}
