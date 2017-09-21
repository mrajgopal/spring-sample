package techie.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import techie.springframework.domain.Product;

@RestController
public class sampleMvcController {
    @RequestMapping(value = "/", method = RequestMethod.POST)
    Product sample(@RequestBody Product product){
        return product;
    }
}
