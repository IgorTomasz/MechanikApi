package example.mechanikapi.Models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Samochod")
@EnableJpaRepositories
@Getter @Setter @NoArgsConstructor
public class Samochod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "samochod_id", nullable = false)
    private Integer samochod_id;
    @Column(length = 20)
    private String marka;
    @Column(length = 20)
    private String model;
    private LocalDate data_rejestracji;
    @ManyToOne
    @JoinColumn(name = "klient_id")
    private Klient klient_id;
    @OneToMany(mappedBy = "samochod_id")
    @JsonBackReference
    @JsonIgnore
    private List<Wizyta> wizytySam;

}
