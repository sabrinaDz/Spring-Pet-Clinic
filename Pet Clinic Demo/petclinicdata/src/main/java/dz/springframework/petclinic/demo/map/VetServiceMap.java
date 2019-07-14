package dz.springframework.petclinic.demo.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dz.springframework.petclinic.demo.model.Vet;
import dz.springframework.petclinic.demo.services.CrudService;
import dz.springframework.petclinic.demo.services.VetService;


@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> 
implements VetService{

	
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
		return super.save(vet);
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
