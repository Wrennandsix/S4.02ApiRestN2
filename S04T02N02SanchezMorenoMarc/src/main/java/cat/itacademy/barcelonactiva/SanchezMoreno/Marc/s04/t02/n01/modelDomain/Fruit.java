package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t02.n01.modelDomain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fruit {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	private String name;
	
	private int quantityKg;

	public Fruit() {

	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantityKg() {
		return quantityKg;
	}

	public void setQuantityKg(int quantityKg) {
		this.quantityKg = quantityKg;
	}
	
	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", quantityKg=" + quantityKg + "]";
	}

}
