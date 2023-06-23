package example.mechanikapi.Repositories;

import example.mechanikapi.Models.User_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User_details, Integer> {

    @Query("Select u from User_details u where u.user_name=?1")
    User_details findByUsername(String userName);
}
