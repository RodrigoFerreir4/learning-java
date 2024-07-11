package com.jobs_api.modules.candidates;


import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {
    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "username não deve conter espaço")
    private String username;

    @Email(message = "O campo deve conter um email valido")
    @NotBlank
    private String email;

    @NotBlank
    @Length(min = 5, max = 15)
    private String password;

    private String description;

    private String curriculum;
}


