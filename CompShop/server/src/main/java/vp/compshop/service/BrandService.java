package vp.compshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vp.compshop.model.Brand;
import vp.compshop.repository.BrandRepository;

@Service
public class BrandService {
	
	@Autowired
	BrandRepository repository;
	
	public Brand findOne(Long id) {
		return repository.findOne(id);
	}
	
	public List<Brand> findAll() {
		return repository.findAll();
	}
	
	public Brand save(Brand brand) {
		return repository.save(brand);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
}
