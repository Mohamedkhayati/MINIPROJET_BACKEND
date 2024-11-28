package com.mohamed.supplements.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohamed.supplements.entities.Supplement;
import com.mohamed.supplements.entities.Nutritional;
import com.mohamed.supplements.repos.SupplementRepository;

@Service
public class SupplementServiceImpl implements SupplementService {

    @Autowired
    SupplementRepository supplementRepository;

    @Override
    public Supplement saveSupplement(Supplement s) {
        return supplementRepository.save(s);
    }

    @Override
    public Supplement updateSupplement(Supplement s) {
        return supplementRepository.save(s);
    }

    @Override
    public void deleteSupplement(Supplement s) {
        supplementRepository.delete(s);
    }

    @Override
    public void deleteSupplementById(Long id) {
        supplementRepository.deleteById(id);
    }

    @Override
    public Supplement getSupplement(Long id) {
        return supplementRepository.findById(id).get();
    }

    @Override
    public List<Supplement> getAllSupplements() {
        return supplementRepository.findAll();
    }

    @Override
    public List<Supplement> findByNomSupplement(String nom) {
        return supplementRepository.findByNomSupplement(nom);
    }

    @Override
    public List<Supplement> findByNomSupplementContains(String nom) {
        return supplementRepository.findByNomSupplementContains(nom);
    }

    @Override
    public List<Supplement> findByNomPrix(String nom, Double prix) {
        return supplementRepository.findByNomPrix(nom, prix);
    }

    @Override
    public List<Supplement> findByNutritional(Nutritional nutritional) {
        return supplementRepository.findByNutritional(nutritional);
    }

    @Override
    public List<Supplement> findByNutritionalIdNutritional(Long id) {
        return supplementRepository.findByNutritionalIdNut(id);
    }

    @Override
    public List<Supplement> findByOrderByNomSupplementAsc() {
        return supplementRepository.findByOrderByNomSupplementAsc();
    }

    @Override
    public List<Supplement> trierSupplementsNomsPrix() {
        return supplementRepository.trierSupplementsNomsPrix();
    }
}
