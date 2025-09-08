package com.ecommerce.user.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


import java.time.LocalDateTime;

@Data
@Entity
public class Customer {
    @Id
    private String id;
    private String keycloakId;
    private String firstName;
    private String lastName;


    private String email;
    private String phone;
    private CustomerRole role = CustomerRole.CUSTOMER;
    
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}