package dz.springframework.petclinic.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import dz.springframework.petclinic.demo.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long>{

}
