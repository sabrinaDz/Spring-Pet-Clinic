package dz.springframework.petClinic.Demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dz.springframework.petclinic.demo.services.VetService;



@Controller
public class VetsController {

	
	private final VetService vetService;
	
	
	
	public VetsController(VetService vetService) {
		super();
		this.vetService = vetService;
	}



	@RequestMapping({"/vets","vets/index","vets/index.html"})
	public String listVets(){
		return "vets/index";
	}
	
}
