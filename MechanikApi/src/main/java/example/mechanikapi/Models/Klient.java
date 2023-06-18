package example.mechanikapi.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@Entity
@EnableJpaRepositories
@Getter @Setter @NoArgsConstructor
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "klient_id", nullable = false)
    private Integer klient_id;
    @Column(length = 15)
    private String firstName;
    @Column(length = 25)
    private String lastName;
    @Column(length = 9)
    private int nr_tel;
    @OneToMany(mappedBy = "wlasciciel")
    private List<Samochod> samochody;
}