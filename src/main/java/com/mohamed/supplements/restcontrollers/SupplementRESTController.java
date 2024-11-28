package com.mohamed.supplements.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.mohamed.supplements.entities.Supplement;
import com.mohamed.supplements.service.SupplementService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SupplementRESTController {

    @Autowired
    SupplementService supplementService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Supplement> getAllSupplements() {
        return supplementService.getAllSupplements();
    }
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Supplement getSupplementById(@PathVariable("id") Long id) {
        return supplementService.getSupplement(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Supplement createSupplement(@RequestBody Supplement supplement) {
        return supplementService.saveSupplement(supplement);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Supplement updateSupplement(@RequestBody Supplement supplement) {
        return supplementService.updateSupplement(supplement);
    }
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteSupplement(@PathVariable("id") Long id) {      
        supplementService.deleteSupplementById(id);
    }
    @RequestMapping(value="/suppsnut/{idNut}", method = RequestMethod.GET)
    public List<Supplement> getSupplementsByNutId(@PathVariable("idNut") Long idNut) {
        return supplementService.findByNutritionalIdNutritional(idNut);
    }

    

}