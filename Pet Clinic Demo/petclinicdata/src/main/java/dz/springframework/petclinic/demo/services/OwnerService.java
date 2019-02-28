package dz.springframework.petclinic.demo.services;

import java.util.Set;

import dz.springframework.petclinic.demo.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

	Owner findByLastName(String lastName);
 
	
	
	
}
