package pl.edu.pjatk.pjatkwej.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pjatk.pjatkwej.Models.Sandwich;

import java.util.List;

@Repository
public interface SandwichRepository extends JpaRepository<Sandwich, Integer> {
    List<Sandwich> findAllByIdLessThanEqual(int id);
}
