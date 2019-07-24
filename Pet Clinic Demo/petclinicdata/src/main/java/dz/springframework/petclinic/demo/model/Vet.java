package dz.springframework.petclinic.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="vets")
public class Vet extends Person {

	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="vetsSpecialities",joinColumns=@JoinColumn(name="vet_id"),
	inverseJoinColumns=@JoinColumn(name="speciality_id"))
	private Set<Speciality> specialities=new HashSet();

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}



	
}
