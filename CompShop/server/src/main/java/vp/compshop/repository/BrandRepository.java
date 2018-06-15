package vp.compshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vp.compshop.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
	
}
