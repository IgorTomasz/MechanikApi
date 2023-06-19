package example.mechanikapi.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@Entity
@Table(name = "mechanik")
@EnableJpaRepositories
@Getter @Setter @NoArgsConstructor
public class Mechanik {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mechanik_id", nullable = false)
    private Integer mechanik_id;
    @Column(length = 15)
    private String first_name;
    @Column(length = 25)
    private String last_name;
    @Column(length = 9)
    private int nr_tel;
    @Column(precision = 2)
    private double stawka_godz;
    @OneToMany(mappedBy = "mechanik_id")
    @JsonBackReference
    private List<Wizyta> wizytyMech;
}
