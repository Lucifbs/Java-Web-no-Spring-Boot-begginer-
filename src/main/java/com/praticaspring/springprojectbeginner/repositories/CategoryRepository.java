package com.praticaspring.springprojectbeginner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praticaspring.springprojectbeginner.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
