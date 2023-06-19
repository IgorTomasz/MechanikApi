package example.mechanikapi.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Wizyta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wizyta_id", nullable = false)
    private Integer wizyta_id;

    @ManyToOne
    @JoinColumn(name = "samochod_id")
    @JsonManagedReference
    private Samochod samochod_id;

    @ManyToOne
    @JoinColumn(name = "status_id")
    @JsonManagedReference
    private Status status_id;

    private LocalDate data_przyjecia;

    @Column(columnDefinition = "date default null")
    private LocalDate data_zakonczenia;

    @Column(length = 250)
    private String opis;

    @ManyToOne
    @JoinColumn(name = "mechanik_id")
    @JsonManagedReference
    private Mechanik mechanik_id;
}
