package dz.springframework.petclinic.demo.services;

import java.util.Set;

import dz.springframework.petclinic.demo.model.Pet;

public interface PetService {

	
	Pet findById(Long id);
	Pet savePet(Pet pet);
	Set<Pet>findAll();
}
