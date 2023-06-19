package example.mechanikapi.Controllers;

import example.mechanikapi.Models.Wizyta;
import example.mechanikapi.Services.WizytaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wizyta")
public class WizytaController {
    private final WizytaService wizytaService;
    public WizytaController(WizytaService wizytaService){
        this.wizytaService=wizytaService;
    }

    @GetMapping()
    public ResponseEntity<List<Wizyta>> findAll(){
        return ResponseEntity.ok(wizytaService.getAll());
    }
}
