package example.mechanikapi.Repositories;

import example.mechanikapi.Models.Wizyta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WizytaRepository extends JpaRepository<Wizyta,Integer>, PagingAndSortingRepository<Wizyta,Integer> {
}
