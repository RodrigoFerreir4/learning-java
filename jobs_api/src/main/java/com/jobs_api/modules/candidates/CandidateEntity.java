package com.jobs_api.modules.candidates;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "candidate")
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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

    @CreationTimestamp
    private LocalDateTime createdAt;
}


