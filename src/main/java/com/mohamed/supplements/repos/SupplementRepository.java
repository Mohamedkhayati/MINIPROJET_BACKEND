package com.mohamed.supplements.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohamed.supplements.entities.Nutritional;
import com.mohamed.supplements.entities.Supplement;
@RepositoryRestResource(path = "rest")
@RestController
@RequestMapping("/supplements/rest")

public interface SupplementRepository extends JpaRepository<Supplement, Long> {
	List<Supplement> findByNomSupplement(String nom);
	List<Supplement> findByNomSupplementContains(String nom);
	@Query("select s from Supplement s where s.nomSupplement like %?1 and s.prixSupplement > ?2")
	List<Supplement> findByNomPrix(String nom, Double prix);
	@Query("select s from Supplement s where s.nutritional = ?1")
	List<Supplement> findByNutritional(Nutritional nutritional);
	List<Supplement> findByNutritionalIdNut(Long id);

	List<Supplement> findByOrderByNomSupplementAsc();

	@Query("select s from Supplement s order by s.nomSupplement ASC, s.prixSupplement DESC")
	List<Supplement> trierSupplementsNomsPrix();

}
