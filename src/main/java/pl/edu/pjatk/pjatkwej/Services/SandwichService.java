package pl.edu.pjatk.pjatkwej.Services;

import org.springframework.stereotype.Service;
import pl.edu.pjatk.pjatkwej.Models.Ingredient;
import pl.edu.pjatk.pjatkwej.Models.Sandwich;
import pl.edu.pjatk.pjatkwej.Models.SandwichSize;

import java.util.List;

@Service
public class SandwichService {

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
        return new Sandwich(null, sandwichName, 1550, 54.0d, List.of(bread), SandwichSize.SMALL);
    }
}
