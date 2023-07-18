package com.jwtexample.model.auth;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class JwtRequest {
    private String email;
    private String password;
}
