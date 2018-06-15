package vp.compshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(catalog="compshop", name="brand")
public class Brand {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	public Brand() {}
	
	public Brand(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
