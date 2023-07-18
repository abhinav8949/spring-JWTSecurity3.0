package com.jwtexample.model.auth;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class JwtResponse {
    private String jwtToken;
    private String username;
}
