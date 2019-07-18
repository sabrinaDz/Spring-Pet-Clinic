package dz.springframework.petclinic.demo.services;

import java.util.Set;

 
 
public interface CrudService<T,ID> {

	
	T findById(Long id);
	Set<T>findAll();
	T save(T object);
	void delete(T object);
	void deleteBydId(Long id);
	
}
