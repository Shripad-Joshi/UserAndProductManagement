package com.expo.managmentSystem.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@Table(name = "address_table")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @Column(nullable = false)
    private String street;
    private String addressLine1;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false,length = 6)
    private String zipCode;
    private boolean isPrimary;

    @JoinColumn(name="userId")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
