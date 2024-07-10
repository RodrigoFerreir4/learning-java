package com.jobs_api.modules.candidates;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    @Pattern(regexp = "^(?!\\s*$).+", message = "username não deve conter espaço")
    private String username;

    @Email(message = "O campo deve conter um email valido")
    @NotNull
    private String email;

    @NotNull
    @Length(min = 5, max = 15)
    private String password;

    private String description;

    private String curriculum;
}


