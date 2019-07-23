package dz.springframework.petclinic.demo.map;

import java.util.Set;



import org.springframework.stereotype.Service;

import dz.springframework.petclinic.demo.model.Pet;
import dz.springframework.petclinic.demo.services.PetService;


@Service
public class PetServiceMap  extends AbstractMapService<Pet,Long>
implements PetService{

	@Override 
	public Set<Pet>findAll(){
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		  super.delete(object);
	}

	@Override
	public void deleteBydId(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}
