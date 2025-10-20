package com.expo.managmentSystem.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class UserDTO {

    @NotNull(message = "User name cannot be null")
    private String userName;

    @NotNull(message = "Email cannot be null")
    @Email(regexp = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Invalid email format")
    private String email;

    @NotNull(message = "Password cannot be null")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character")
    private String password;

    @Min(value = 18,message = "Age must be at least 18")
    private int age;

    @NotNull(message = "Mobile number cannot be null")
    @Size(min = 10, max = 10,message = "Mobile number must be 10 digits")
    private String mobileNo;

    private List<AddressDTO> addressList;
}
