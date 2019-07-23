package dz.springframework.petclinic.demo.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import dz.springframework.petclinic.demo.model.Speciality;
import dz.springframework.petclinic.demo.services.SpecialityService;


@Service
public class SpecialityMapService extends AbstractMapService<Speciality,Long> 
implements SpecialityService{

	public Set<Speciality>findAll(){
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality speciality) {
		// TODO Auto-generated method stub
		return super.save(speciality);
	}

	@Override
	public void delete(Speciality speciality) {
		// TODO Auto-generated method stub
		super.delete(speciality);
	}

	@Override
	public void deleteBydId(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}





}
