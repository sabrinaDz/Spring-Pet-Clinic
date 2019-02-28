package dz.springframework.petclinic.demo.services;

import java.util.Set;

import dz.springframework.petclinic.demo.model.Vet;

public interface VetService {


	Vet findById(Long id);
	Vet saveOwner(Vet vet);
	Set<Vet>findAll();
}
