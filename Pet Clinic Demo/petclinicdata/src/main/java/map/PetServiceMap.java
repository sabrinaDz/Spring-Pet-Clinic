package map;

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
		return this.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBydId(Long id) {
		// TODO Auto-generated method stub
		
	}

}
