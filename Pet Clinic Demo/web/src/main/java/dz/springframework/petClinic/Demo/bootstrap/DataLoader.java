package dz.springframework.petClinic.Demo.bootstrap;

import map.OwnerServiceMap;
import map.VetServiceMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dz.springframework.petclinic.demo.model.Owner;
import dz.springframework.petclinic.demo.model.Vet;
import dz.springframework.petclinic.demo.services.OwnerService;
import dz.springframework.petclinic.demo.services.VetService;


@Component
public class DataLoader implements CommandLineRunner{

	 
	private  final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader() {
		ownerService=new OwnerServiceMap();
		vetService=new VetServiceMap();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Owner owner1=new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Sabrina");
		owner1.setLastName("SAHLI");
		ownerService.save(owner1);
		
		Owner owner2=new Owner();
		owner2.setId(2L);
		owner2.setFirstName("YACINE");
		owner2.setLastName("KORICHE");
		ownerService.save(owner2);
		
		System.out.println("Owners Loaded ..");
		
		Vet vet1= new Vet();
		vet1.setId(1L);
		vet1.setFirstName("ADAM");
		vet1.setLastName("KORICHE");
		vetService.save(vet1);
		
		Vet vet2= new Vet();
		vet2.setId(2L);
		vet2.setFirstName("DAOUD");
		vet2.setLastName("SAHLI");
		vetService.save(vet2);
		
		System.out.println("Vets Loaded ..");
	}

}
