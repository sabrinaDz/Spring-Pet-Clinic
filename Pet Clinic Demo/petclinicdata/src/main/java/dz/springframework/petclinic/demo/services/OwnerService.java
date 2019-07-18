package dz.springframework.petclinic.demo.services;



import dz.springframework.petclinic.demo.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

	Owner findByLastName(String lastName);
 
	
	
	
}
