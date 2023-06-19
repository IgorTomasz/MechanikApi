package example.mechanikapi.Services;

import example.mechanikapi.Models.Klient;
import example.mechanikapi.Repositories.KlientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class KlientService {
    private final KlientRepository klientRepository;
    public KlientService(KlientRepository klientRepository){
        this.klientRepository=klientRepository;
    }

    public Page<Klient> getAll(){

        return klientRepository.findAll(PageRequest.of(0,10));
    }
}
