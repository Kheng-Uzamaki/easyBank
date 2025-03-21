package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name = "Error Response",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API path invoke by client"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error happended"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message representing the error happended"
    )
    private String errorMessage;

    @Schema(
            description = "Time representing the error happended"
    )
    private LocalDateTime errorTime;
}
