package example.mechanikapi.Services;


import example.mechanikapi.Models.User_details;
import example.mechanikapi.Repositories.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,@Lazy PasswordEncoder passwordEncoder){
        this.userRepository=userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User_details user = userRepository.findByUsername(username);

        if (user == null){
            throw new UsernameNotFoundException("Użytkownik o nazwie "+username+" nie istnieje");
        }


        return org.springframework.security.core.userdetails.User.builder().username(user.getUsername())
                .password(passwordEncoder.encode(user.getPassword())).roles(user.getUser_role_id().getName()).build();
    }


}
