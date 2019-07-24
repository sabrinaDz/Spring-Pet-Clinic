package dz.springframework.petclinic.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import dz.springframework.petclinic.demo.model.Owner;



public interface OwnerRepository  extends CrudRepository<Owner,Long>{

}
