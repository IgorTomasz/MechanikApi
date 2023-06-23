package example.mechanikapi.Configuration;

import example.mechanikapi.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((auth)->{
            try {
                auth.requestMatchers("/klienci").hasRole("MANAGER").and().csrf(AbstractHttpConfigurer::disable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).httpBasic(Customizer.withDefaults());
         return http.build();
    }

    @Bean
    public UserDetailsService onlyUsers(PasswordEncoder passwordEncoder){
        User.UserBuilder users = User.builder();

        UserDetails jan = users.username("jan").password(passwordEncoder.encode("abc123")).roles("MANAGER").build();
        UserDetails kacper = users.username("kacper").password(passwordEncoder.encode("qaz123")).roles("MECHANIK").build();
        return new InMemoryUserDetailsManager(jan,kacper);
    }

}
