package com.desenvolvimento.capcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desenvolvimento.capcatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
