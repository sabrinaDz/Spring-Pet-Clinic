package dz.springframework.petclinic.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import dz.springframework.petclinic.demo.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long>{

}
