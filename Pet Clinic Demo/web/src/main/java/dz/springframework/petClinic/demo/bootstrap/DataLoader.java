package dz.springframework.petClinic.demo.bootstrap;

 




 
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dz.springframework.petclinic.demo.model.Owner;
import dz.springframework.petclinic.demo.model.Pet;
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
		owner1.setAdress("37 rue des marais");
		owner1.setCity("Saint gratien");
		owner1.setTelephone("0110000002");
		Pet dog1=new Pet();
		dog1.setPetType(saveDogPetType);
		dog1.setOwner(owner1);
		dog1.setName("bobby");
	    dog1.setBirthDay(LocalDate.now());
	    owner1.getPets().add(dog1);
		ownerService.save(owner1);
		
		Owner owner2=new Owner();
		//owner2.setId(2L);
		owner2.setFirstName("YACINE");
		owner2.setLastName("KORICHE");
		owner1.setAdress("37 rue des marais");
		owner1.setCity("Saint gratien");
		owner1.setTelephone("0110000032");
		
		
		
		Pet cat1=new Pet();
		cat1.setPetType(saveCatPetType);
		cat1.setOwner(owner2);
		cat1.setName("catous");
	    cat1.setBirthDay(LocalDate.now());
	    owner2.getPets().add(cat1);
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
