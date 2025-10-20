package com.expo.managmentSystem.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddressDTO {

    @NotNull(message = "Street cannot be null")
    private String street;
    private String addressLine1;

    @NotNull(message = "City cannot be null")
    private String city;

    @NotNull(message = "State cannot be null")
    private String state;

    @NotNull(message = "Zip code cannot be null")
    @Size(min = 6, max = 6, message = "Zip code must be 6 digits")
    private String zipCode;
    private boolean isPrimary;

}
