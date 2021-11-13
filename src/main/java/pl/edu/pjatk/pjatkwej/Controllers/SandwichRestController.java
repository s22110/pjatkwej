package pl.edu.pjatk.pjatkwej.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjatk.pjatkwej.Models.Ingredient;
import pl.edu.pjatk.pjatkwej.Models.Sandwich;
import pl.edu.pjatk.pjatkwej.Models.SandwichSize;
import pl.edu.pjatk.pjatkwej.Services.SandwichService;

import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwichRestController {
    private final SandwichService sandwichService;

    SandwichRestController(SandwichService sandwichService){
        this.sandwichService = sandwichService;
    }

    @GetMapping("/example")
    public ResponseEntity<Sandwich> getExampleSandwich(){

        Sandwich sandwich = sandwichService.prepareSandwich();
        return ResponseEntity.ok(sandwich);
    }

    @GetMapping("/supersandwich")
    public ResponseEntity<Sandwich> getSuperSandwich(){
        Sandwich superSandwich = sandwichService.prepareSandwich("Super Sandwich");
        return ResponseEntity.ok(superSandwich);
    }

    @GetMapping("/topfive")
    public ResponseEntity<List<Sandwich>> getTopFiveSandwiches(){
        var topFive = sandwichService.getTopFive();
        return ResponseEntity.ok(topFive);
    }
}
