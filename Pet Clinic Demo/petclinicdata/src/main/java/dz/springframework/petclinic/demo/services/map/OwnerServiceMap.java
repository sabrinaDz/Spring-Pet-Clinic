 package dz.springframework.petclinic.demo.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dz.springframework.petclinic.demo.model.Owner;
import dz.springframework.petclinic.demo.model.Pet;
import dz.springframework.petclinic.demo.services.OwnerService;
import dz.springframework.petclinic.demo.services.PetService;
import dz.springframework.petclinic.demo.services.PetTypeService;



@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> 
implements OwnerService{

	private PetTypeService petTypeService;
	private PetService petService;
	
	
	
	
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

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
		if(object!=null){
			
			if(object.getPets()!=null){
				object.getPets().forEach(pet->{
					if(pet.getPetType()!=null){
						if(pet.getPetType().getId()==null){
					    	pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else{
						throw new RuntimeException("Pet Type is required");
					}
					
					if(pet.getId()==null){
						Pet savedPet=petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
				
			}
			return super.save(object);
			
		}else{
			return null;
		}
		
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
