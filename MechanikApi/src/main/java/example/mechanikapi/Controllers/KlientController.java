package example.mechanikapi.Controllers;

import example.mechanikapi.Models.Klient;
import example.mechanikapi.Services.KlientService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/klienci")
public class KlientController {
    private final KlientService klientService;
    public KlientController(KlientService klientService){
        this.klientService=klientService;
    }

    @GetMapping
    public ResponseEntity<List<Klient>> getAllClients(){
        return ResponseEntity.ok(klientService.getAll().getContent());
    }
}
