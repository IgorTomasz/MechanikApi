package example.mechanikapi.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;
import java.util.List;

@Entity
@EnableJpaRepositories
@Getter @Setter @NoArgsConstructor
public class Samochod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "samochod_id", nullable = false)
    private Integer samochod_id;
    @Column(length = 20)
    private String marka;
    @Column(length = 20)
    private String model;
    private LocalDate data_rejestracji;
    @ManyToOne
    @JoinColumn(name = "klient_id")
    private Klient wlasciciel;
    @OneToMany(mappedBy = "samochodyWizyta")
    private List<Wizyta> wizytySam;

}
