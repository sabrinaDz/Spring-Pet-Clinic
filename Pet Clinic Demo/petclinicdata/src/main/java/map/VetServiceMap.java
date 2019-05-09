package map;

import java.util.Set;

import dz.springframework.petclinic.demo.model.Vet;
import dz.springframework.petclinic.demo.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet,Long> 
implements CrudService<Vet,Long>{

	
	@Override 
	public Set<Vet>findAll(){
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Vet save(Vet vet) {
		// TODO Auto-generated method stub
		return super.save(vet.getId(), vet);
	}

	@Override
	public void deleteBydId(Long id) {
		super.deleteById(id);
		
	}
	
	@Override
	public void delete(Vet vet){
		  super.delete(vet);
	}

}
