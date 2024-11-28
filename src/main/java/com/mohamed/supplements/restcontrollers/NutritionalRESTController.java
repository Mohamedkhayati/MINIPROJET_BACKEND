package com.mohamed.supplements.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mohamed.supplements.entities.Nutritional;
import com.mohamed.supplements.repos.NutritionalRespository;

@RestController
@RequestMapping("/api/nut")
@CrossOrigin("*")
public class NutritionalRESTController {

    @Autowired
    NutritionalRespository nutritionalRespository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Nutritional> getAllCategories() {
        return nutritionalRespository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Nutritional getNutritionalById(@PathVariable("id") Long id) {
        return nutritionalRespository.findById(id).get();
    }
}
