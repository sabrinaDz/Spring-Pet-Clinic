package dz.springframework.petClinic.demo.bootstrap;

 




 
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dz.springframework.petclinic.demo.model.Owner;
import dz.springframework.petclinic.demo.model.Pet;
import dz.springframework.petclinic.demo.model.PetType;
import dz.springframework.petclinic.demo.model.Speciality;
import dz.springframework.petclinic.demo.model.Vet;
import dz.springframework.petclinic.demo.services.OwnerService;
import dz.springframework.petclinic.demo.services.PetService;
import dz.springframework.petclinic.demo.services.PetTypeService;
import dz.springframework.petclinic.demo.services.SpecialityService;
import dz.springframework.petclinic.demo.services.VetService;
 


@Component
public class DataLoader implements CommandLineRunner{

	 
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;



	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,SpecialityService specialityService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService=petTypeService;
		this.specialityService=specialityService;
	}




	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(petTypeService.findAll().size()==0){
			loadData();
		}
	}




	private void loadData() {
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
		
		Speciality speciality1=new Speciality();
		speciality1.setDescription("Surgery");
		Speciality savedSpeciality1=specialityService.save(speciality1);
		
		Speciality speciality2=new Speciality();
		speciality2.setDescription("Radiology");
		Speciality savedSpeciality2=specialityService.save(speciality1);
		
		Speciality speciality3=new Speciality();
		speciality3.setDescription("Surgery");
		Speciality savedSpeciality3=specialityService.save(speciality1);
		
		Vet vet1= new Vet();
		//vet1.setId(1L);
		vet1.setFirstName("ADAM");
		vet1.setLastName("KORICHE");
		vet1.getSpecialities().add(savedSpeciality1);
		vetService.save(vet1);
		
		Vet vet2= new Vet();
		//vet2.setId(2L);
		vet2.setFirstName("DAOUD");
		vet2.setLastName("SAHLI");
		vet2.getSpecialities().add(savedSpeciality2);
		vetService.save(vet2);
		
		System.out.println("Vets Loaded ..");
	}

}
