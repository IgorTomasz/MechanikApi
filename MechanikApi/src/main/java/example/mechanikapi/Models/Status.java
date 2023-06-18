package example.mechanikapi.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@Entity
@EnableJpaRepositories
@Table(name = "s_status")
@Getter @Setter @NoArgsConstructor
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "status_id", nullable = false)
    private Integer status_id;
    @Column(length = 15)
    private String name;
    @OneToMany(mappedBy = "status")
    private List<Wizyta> wizytyStat;

}
