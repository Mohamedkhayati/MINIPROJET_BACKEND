package com.mohamed.supplements;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mohamed.supplements.entities.Supplement;
import com.mohamed.supplements.entities.Nutritional;
import com.mohamed.supplements.repos.SupplementRepository;

@SpringBootTest
class SupplementsApplicationTests {

    @Autowired
    private SupplementRepository supplementRepository;

    @Test
    public void testCreateSupplement() {
        Supplement supp = new Supplement("Whey Protein", 45.99,3.0,  new Date());
        supplementRepository.save(supp);
    }

    @Test
    public void testFindSupplement() {
        Supplement s = supplementRepository.findById(1L).get();
        System.out.println(s);
    }

    @Test
    public void testUpdateSupplement() {
        Supplement s = supplementRepository.findById(1L).get();
        s.setPrixSupplement(50.0);
        supplementRepository.save(s);
    }

    @Test
    public void testDeleteSupplement() {
        supplementRepository.deleteById(1L);
    }

    @Test
    public void testListAllSupplements() {
        List<Supplement> supplements = supplementRepository.findAll();
        for (Supplement s : supplements) {
            System.out.println(s);
        }
    }

    @Test
    public void testFindSupplementByName() {
        List<Supplement> supplements = supplementRepository.findByNomSupplement("Creatine");
        for (Supplement s : supplements) {
            System.out.println(s);
        }
    }

    @Test
    public void testFindSupplementByNameContains() {
        List<Supplement> supplements = supplementRepository.findByNomSupplementContains("Protein");
        for (Supplement s : supplements) {
            System.out.println(s);
        }
    }

    @Test
    public void testFindByNomPrix() {
        List<Supplement> supplements = supplementRepository.findByNomPrix("Whey Protein", 45.99);
        for (Supplement s : supplements) {
            System.out.println(s);
        }
    }

    @Test
    public void testFindByNutritional() {
        Nutritional nutritional = new Nutritional();
        nutritional.setIdNut(2L);
        List<Supplement> supplements = supplementRepository.findByNutritional(nutritional);
        for (Supplement s : supplements) {
            System.out.println(s);
        }
    }

    @Test
    public void testFindByNutritionalIdNutritional() {
        List<Supplement> supplements = supplementRepository.findByNutritionalIdNut(1L);
        for (Supplement s : supplements) {
            System.out.println(s);
        }
    }

    @Test
    public void testFindByOrderByNomSupplementAsc() {
        List<Supplement> supplements = supplementRepository.findByOrderByNomSupplementAsc();
        for (Supplement s : supplements) {
            System.out.println(s);
        }
    }

    @Test
    public void testSortSupplementsByNamesAndPrice() {
        List<Supplement> supplements = supplementRepository.trierSupplementsNomsPrix();
        for (Supplement s : supplements) {
            System.out.println(s);
        }
    }
}
