package example.mechanikapi.Controllers;

import example.mechanikapi.Models.Klient;
import example.mechanikapi.Services.KlientService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/klienci")
@CrossOrigin()
public class KlientController {
    private final KlientService klientService;
    public KlientController(KlientService klientService){
        this.klientService=klientService;
    }

    @GetMapping
    public ResponseEntity<List<Klient>> getAllClients(){
        return ResponseEntity.ok(klientService.getAll().getContent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Klient> getClient(@PathVariable Integer id){
        Optional<Klient> klientOptional = klientService.getKlient(id);
        if (klientOptional.isPresent()){
            return ResponseEntity.ok(klientOptional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Void> addKlient(@RequestBody Klient nowyKlient, UriComponentsBuilder ucb){
        Klient savedKlient = klientService.addNew(nowyKlient);
        URI locationOfNewKlient = ucb.path("/klienci/{id}").buildAndExpand(savedKlient.getKlient_id()).toUri();
        return ResponseEntity.created(locationOfNewKlient).build();
    }
}
