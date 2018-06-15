package vp.compshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vp.compshop.model.ComponentItem;
import vp.compshop.service.ComponentItemService;

@RestController
@RequestMapping(value="/api/components")
public class ComponentItemController {
	
	@Autowired
	ComponentItemService service;
	
	@GetMapping
	public ResponseEntity<Page<ComponentItem>> getComponents(Pageable page) {
		Page<ComponentItem> retVal = service.findAll(page);
		return new ResponseEntity<>(retVal, HttpStatus.OK);
	}
	
}