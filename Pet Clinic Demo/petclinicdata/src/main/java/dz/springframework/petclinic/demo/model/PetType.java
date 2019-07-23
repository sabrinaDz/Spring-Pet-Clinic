package dz.springframework.petclinic.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="petType")
public class PetType extends BaseEntity {

	
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
