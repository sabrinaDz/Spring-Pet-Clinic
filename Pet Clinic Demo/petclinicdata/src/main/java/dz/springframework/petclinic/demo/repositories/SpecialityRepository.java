package dz.springframework.petclinic.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import dz.springframework.petclinic.demo.model.Speciality;

public interface SpecialityRepository  extends  CrudRepository<Speciality,Long>{

}
