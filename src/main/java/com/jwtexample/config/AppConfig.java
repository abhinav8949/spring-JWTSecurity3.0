package com.jwtexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {
//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails user1 = User.builder().username("abhinav").password(passwordEncoder().encode("12345")).roles("admin").build();
//        UserDetails user2 = User.builder().username("kundan").password(passwordEncoder().encode("12345")).roles("admin").build();
//        return new InMemoryUserDetailsManager(user1, user2);
//    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}
