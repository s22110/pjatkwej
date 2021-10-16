package pl.edu.pjatk.pjatkwej.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjatk.pjatkwej.Models.Ingredient;
import pl.edu.pjatk.pjatkwej.Models.Sandwich;
import pl.edu.pjatk.pjatkwej.Models.SandwichSize;

import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {

    @GetMapping("/example")
    public ResponseEntity<Sandwich> getExampleSandwich(){

        Ingredient bread = new Ingredient(null, "white bread", 100, 5.0d);
        Sandwich poor = new Sandwich(null, "poor", 100, 5.0d, List.of(bread), SandwichSize.KING_SIZE);

        return ResponseEntity.ok(poor);
    }

    @GetMapping("/nullExample")
    public ResponseEntity<Sandwich> getNullExampleSandwich(){

        Sandwich poor = new Sandwich(null, "poor", 100, 5.0d, null, SandwichSize.KING_SIZE);

        return ResponseEntity.ok(poor);
    }
}
