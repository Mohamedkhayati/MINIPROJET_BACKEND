package com.mohamed.supplements.service;

import java.util.List;
import com.mohamed.supplements.entities.Supplement;
import com.mohamed.supplements.entities.Nutritional;

public interface SupplementService {
    Supplement saveSupplement(Supplement s);
    Supplement updateSupplement(Supplement s);
    void deleteSupplement(Supplement s);
    void deleteSupplementById(Long id);
    Supplement getSupplement(Long id);
    List<Supplement> getAllSupplements();
    List<Supplement> findByNomSupplement(String nom);
    List<Supplement> findByNomSupplementContains(String nom);
    List<Supplement> findByNomPrix(String nom, Double prix);
    List<Supplement> findByNutritional(Nutritional nutritional);
    List<Supplement> findByNutritionalIdNutritional(Long id);
    List<Supplement> findByOrderByNomSupplementAsc();
    List<Supplement> trierSupplementsNomsPrix();
}
