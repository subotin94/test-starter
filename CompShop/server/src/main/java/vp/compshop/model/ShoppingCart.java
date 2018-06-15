package vp.compshop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(catalog="compshop", name="shopping_cart")
public class ShoppingCart {

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
	List<ComponentItem> items = new ArrayList<>();

	public ShoppingCart() {}
	
	public ShoppingCart(Long id, String username, List<ComponentItem> items) {
		super();
		this.id = id;
		this.username = username;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<ComponentItem> getItems() {
		return items;
	}

	public void setItems(List<ComponentItem> items) {
		this.items = items;
	}

}
