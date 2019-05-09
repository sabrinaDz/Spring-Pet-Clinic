package map;

import java.util.Set;

import dz.springframework.petclinic.demo.model.Owner;
import dz.springframework.petclinic.demo.services.CrudService;

public class OwnerMapServiceMap extends AbstractMapService<Owner,Long> 
implements CrudService<Owner,Long>{

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

}
