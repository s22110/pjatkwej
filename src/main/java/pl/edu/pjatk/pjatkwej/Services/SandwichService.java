package pl.edu.pjatk.pjatkwej.Services;

import org.springframework.stereotype.Service;
import pl.edu.pjatk.pjatkwej.Models.Ingredient;
import pl.edu.pjatk.pjatkwej.Models.Sandwich;
import pl.edu.pjatk.pjatkwej.Models.SandwichSize;
import pl.edu.pjatk.pjatkwej.Repositories.SandwichRepository;

import java.util.List;

@Service
public class SandwichService {

    private final SandwichRepository sandwichRepository;

    public SandwichService(SandwichRepository sandwichRepository){
        this.sandwichRepository = sandwichRepository;

        for(int i = 0; i <= 15; i++){
            prepareSandwich("Sandwich no. " + i);
        }
    }

    public Sandwich getExampleSandwich(){
        Ingredient bread = new Ingredient(null, "white bread", 100, 5.0d);
        return new Sandwich(null, "poor", 100, 5.0d, List.of(bread), SandwichSize.KING_SIZE);
    }

    public Sandwich prepareSandwich(){
        Ingredient bread = new Ingredient(null, "black bread", 1500, 50.0d);
        return new Sandwich(null, "poor", 1550, 54.0d, List.of(bread), SandwichSize.SMALL);
    }

    public Sandwich prepareSandwich(String sandwichName){
        Ingredient bread = new Ingredient(null, "black bread", 1500, 50.0d);
        Sandwich sandwich = new Sandwich(15, "test", 1550, 54.0d, List.of(bread), SandwichSize.SMALL);

        return sandwichRepository.save(sandwich);
    }

    public List<Sandwich> getTopFive(){

        return sandwichRepository.findAllByIdLessThanEqual(5);
    }
}
