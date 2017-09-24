package org.techie.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.techie.domain.Product;

@RestController(value="sample-mvc")
public class SampleMvcController {
	
    @RequestMapping(value = "/sample-mvc/", method = RequestMethod.POST, headers="Content-Type=application/json")
   public Product sample(@RequestBody Product product){
        return product;
    }
}
