package dz.springframework.petclinic.demo.services;

import java.util.Set;

import dz.springframework.petclinic.demo.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner saveOwner(Owner owner);
	Set<Owner>findAll();
	
	
	
}
