package com.codewithnigel.vetclinic.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// @Data generates the @Getter, @Setter, @ToString, @EqualsAndHashCode,
// and @RequiredArgsConstructer all in one.
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OwnerDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private LocalDateTime createdAt; // nice to send to clients to show how long they've been a member
}
