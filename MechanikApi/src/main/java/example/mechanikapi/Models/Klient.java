package example.mechanikapi.Models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@Entity
@Table(name = "Klient")
@EnableJpaRepositories
@Getter @Setter @NoArgsConstructor
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer klient_id;
    @Column(length = 15)
    private String first_name;
    @Column(length = 25)
    private String last_name;
    @Column(length = 9)
    private int nr_tel;
    @OneToMany(mappedBy = "klient_id")
    @JsonIgnore
    private List<Samochod> samochody;
}
