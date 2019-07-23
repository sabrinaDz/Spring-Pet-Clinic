package dz.springframework.petclinic.demo.map;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;
import dz.springframework.petclinic.demo.model.PetType;
import dz.springframework.petclinic.demo.services.PetTypeService;


@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long>
implements PetTypeService {

	public Set<PetType>findAll(){
		 return super.findAll();
	 }
	 
	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public PetType save(PetType petType) {
		// TODO Auto-generated method stub
		return super.save(petType);
	}

	@Override
	public void delete(PetType petType) {
		// TODO Auto-generated method stub
		super.delete(petType);
	}

	@Override
	public void deleteBydId(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

}
