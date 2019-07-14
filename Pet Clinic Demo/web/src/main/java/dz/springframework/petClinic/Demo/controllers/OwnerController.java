package dz.springframework.petClinic.Demo.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dz.springframework.petclinic.demo.services.OwnerService;


@RequestMapping("/owners")
@Controller
public class OwnerController {

	 
	private final OwnerService ownerService;
	
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}


	@RequestMapping({"","/","/index","/index.html"})
	public String listOwners(Model model){
		model.addAttribute(ownerService.findAll());
		return "owners/index";
	}
	
}
