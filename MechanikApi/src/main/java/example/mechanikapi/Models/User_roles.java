package example.mechanikapi.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@Entity
@Table(name = "User_roles")
@EnableJpaRepositories
@Getter @Setter @NoArgsConstructor
public class User_roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id", nullable = false)
    private Integer user_role_id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "user_role_id")
    @JsonIgnore
    private List<User_details> userDetailsList;

}
