package vp.compshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vp.compshop.model.ShoppingCart;
import vp.compshop.repository.ShoppingCartRepository;

@Service
public class ShoppingCartService {
	
	@Autowired
	ShoppingCartRepository repository;
	
	public ShoppingCart findByUsername(String username) {
		return repository.findByUsername(username);
	}
	
	public ShoppingCart save(ShoppingCart cart) {
		return repository.save(cart);
	}
	
}