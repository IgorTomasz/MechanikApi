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
public class Mechanik {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mechanik_id", nullable = false)
    private Integer mechanik_id;
    @Column(length = 15)
    private String firstName;
    @Column(length = 25)
    private String lastName;
    @Column(length = 9)
    private int nr_tel;
    @Column(precision = 2)
    private double stawka_godz;
    @OneToMany(mappedBy = "mechanik")
    private List<Wizyta> wizytyMech;
}
