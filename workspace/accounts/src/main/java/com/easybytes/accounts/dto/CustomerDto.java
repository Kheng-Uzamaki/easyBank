package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer",
            example = "Jonh Doe"
    )
    @NotEmpty(message = "Name can not be null or empty!")
    @Size(min = 5,max = 30,message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email address of the customer", example = "jonhdoe@mail.com"
    )
    @NotEmpty(message = "Email can not be null or empty!")
    @Email(message = "Email address should be vaild value")
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example = "0123456789"
    )
    @NotEmpty(message = "Mobile number can not be null or empty!")
    @Pattern(regexp = "($|[0-9]{10})",message = "Mobile number must be 10 digits!")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
