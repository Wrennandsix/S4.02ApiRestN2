package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.modelRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.modelDomain.Fruit;

@Repository
public interface FruitsRepo extends JpaRepository <Fruit, Integer> {
}
