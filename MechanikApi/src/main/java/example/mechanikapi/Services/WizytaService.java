package example.mechanikapi.Services;

import example.mechanikapi.Models.Wizyta;
import example.mechanikapi.Repositories.WizytaRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WizytaService {
    private final WizytaRepository wizytaRepository;
    public WizytaService(WizytaRepository wizytaRepository){
        this.wizytaRepository=wizytaRepository;
    }

    public List<Wizyta> getAll(){
        return wizytaRepository.findAll(PageRequest.of(0,10)).getContent();
    }
}
