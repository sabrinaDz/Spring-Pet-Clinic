package dz.springframework.petclinic.demo.model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Visit extends BaseEntity{

	private LocalDate date;
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name="pet_id")
	private Pet pet;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
}
