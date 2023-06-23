package example.mechanikapi.Services;

import example.mechanikapi.Models.User_details;
import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@AllArgsConstructor
public class JPAUserDetailsService implements UserDetailsService {

    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User_details userFromDb = userService.getUser(username);

        return new User(userFromDb.getUsername(), userFromDb.getPassword(), Collections.singleton(new SimpleGrantedAuthority("ROLE_"+userFromDb.getUser_role_id().getName())));
    }
}
