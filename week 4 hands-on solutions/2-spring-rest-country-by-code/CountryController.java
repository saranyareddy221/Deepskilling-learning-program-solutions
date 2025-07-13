package com.cognizant.springlearn.controller;
import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {
    CountryService countryService = new CountryService();

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}
