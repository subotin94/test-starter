package vp.compshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vp.compshop.model.ComponentItem;

@Repository
public interface ComponentItemRepository extends JpaRepository<ComponentItem, Long> {

}
