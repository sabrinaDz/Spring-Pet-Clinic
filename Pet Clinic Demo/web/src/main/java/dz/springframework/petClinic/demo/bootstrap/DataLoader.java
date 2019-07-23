package dz.springframework.petClinic.demo.bootstrap;

 




 
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dz.springframework.petclinic.demo.model.Owner;
import dz.springframework.petclinic.demo.model.PetType;
import dz.springframework.petclinic.demo.model.Vet;
import dz.springframework.petclinic.demo.services.OwnerService;
import dz.springframework.petclinic.demo.services.PetTypeService;
import dz.springframework.petclinic.demo.services.VetService;
 


@Component
public class DataLoader implements CommandLineRunner{

	 
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;



	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService=petTypeService;
	}




	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		PetType dog=new PetType();
		dog.setName("dog");
		PetType saveDogPetType=petTypeService.save(dog);
		
		PetType cat=new PetType();
		cat.setName("cat");
		PetType saveCatPetType=petTypeService.save(cat);
		
		
		Owner owner1=new Owner();
		//owner1.setId(1L);
		owner1.setFirstName("Sabrina");
		owner1.setLastName("SAHLI");
		ownerService.save(owner1);
		
		Owner owner2=new Owner();
		//owner2.setId(2L);
		owner2.setFirstName("YACINE");
		owner2.setLastName("KORICHE");
		ownerService.save(owner2);
		
		System.out.println("Owners Loaded ..");
		
		Vet vet1= new Vet();
		//vet1.setId(1L);
		vet1.setFirstName("ADAM");
		vet1.setLastName("KORICHE");
		vetService.save(vet1);
		
		Vet vet2= new Vet();
		//vet2.setId(2L);
		vet2.setFirstName("DAOUD");
		vet2.setLastName("SAHLI");
		vetService.save(vet2);
		
		System.out.println("Vets Loaded ..");
	}

}
