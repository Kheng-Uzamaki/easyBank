package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of Eazy Bank account", example = "3454433243"
    )
    @NotEmpty(message = "Account number can not be null or empty!")
    @Pattern(regexp = "($|[0-9]{10})",message = "Mobile number must be 10 digits!")
    private Long accountNumber;

    @Schema(
            description = "Account type of Eazy Bank account", example = "Saving"
    )
    @NotEmpty(message = "Account type can not be null or empty!")
    private String accountType;

    @Schema(
            description = "Eazy Bank branch address", example = "123 NewYork"
    )
    @NotEmpty(message = "Branch address can not be null or empty!")
    private String branchAddress;
}
