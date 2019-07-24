package dz.springframework.petclinic.demo.repositories;


import org.springframework.data.repository.CrudRepository;

import dz.springframework.petclinic.demo.model.Visit;

public interface VisitRepository  extends CrudRepository<Visit,Long>{

}
