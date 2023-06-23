package example.mechanikapi.Services;


import example.mechanikapi.Models.User_details;
import example.mechanikapi.Repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;

    }

    public User_details getUser(String username){
        return userRepository.findByUsername(username);
    }



}
