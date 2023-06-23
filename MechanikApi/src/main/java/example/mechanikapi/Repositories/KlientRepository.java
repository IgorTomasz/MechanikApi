package example.mechanikapi.Repositories;

import example.mechanikapi.Models.Klient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlientRepository extends JpaRepository<Klient,Integer>, PagingAndSortingRepository<Klient,Integer> {


}
