package vp.compshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import vp.compshop.model.ComponentItem;
import vp.compshop.repository.ComponentItemRepository;

@Service
public class ComponentItemService {
	
	@Autowired
	ComponentItemRepository repository;
	
	public ComponentItem findOne(Long id) {
		return repository.findOne(id);
	}
	
	public Page<ComponentItem> findAll(Pageable page) {
		return repository.findAll(page);
	}
	
	public ComponentItem save(ComponentItem item) {
		return repository.save(item);
	}
	
	public void delete(Long id) {
		repository.delete(id);
	}
	
}
