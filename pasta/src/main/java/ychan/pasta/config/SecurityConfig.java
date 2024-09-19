package ychan.pasta.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Grant Permission For Static Resources
    @Bean WebSecurityCustomizer webSecurityCustomizer() {
        return (web -> web.ignoring().requestMatchers("/css/**", "/js/**", "/img/**"));
    }

    // Enabled Security Temporary
    @Bean
	public WebSecurityCustomizer configure() {
		return (web -> web.ignoring()
				.requestMatchers("/**")
		);
	}

    // Control Authority Example
    /*
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(request -> {
                    request.requestMatchers("/").permitAll();
                    request.requestMatchers("/login").permitAll();
                }).authorizeHttpRequests(request -> {
                    request.requestMatchers("/test").permitAll();
                    request.requestMatchers("/logout").hasAnyAuthority("USER", "ADMIN");
                }).formLogin(Customizer.withDefaults()).build();
    }
    */

}
