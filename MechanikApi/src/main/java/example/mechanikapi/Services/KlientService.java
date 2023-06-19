package example.mechanikapi.Services;

import example.mechanikapi.Models.Klient;
import example.mechanikapi.Repositories.KlientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class KlientService {
    private final KlientRepository klientRepository;
    public KlientService(KlientRepository klientRepository){
        this.klientRepository=klientRepository;
    }

    public Page<Klient> getAll(){

        return klientRepository.findAll(PageRequest.of(0,10));
    }

    public Klient addNew(Klient klient){
        return klientRepository.save(klient);
    }

    public Optional<Klient> getKlient(Integer id){
        return klientRepository.findById(id);
    }
}
