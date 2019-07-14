package dz.springframework.petclinic.demo.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dz.springframework.petclinic.demo.model.Owner;
import dz.springframework.petclinic.demo.services.CrudService;
import dz.springframework.petclinic.demo.services.OwnerService;


@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> 
implements OwnerService{

	@Override 
	public Set<Owner>findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id){
		return super.findById(id);
	}
	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return this.save(object.getId(),object);
	}

	@Override
	public void deleteBydId(Long id) {
		this.deleteById(id);
		
	}
	
	@Override
	public void delete(Owner owner){
		this.delete(owner);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return this.findByLastName(lastName);
	}

}
