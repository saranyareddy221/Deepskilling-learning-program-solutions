package com.cognizant.springlearn.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public void updateCountry(String code, String name) throws CountryNotFoundException {
        Optional<Country> optional = countryRepository.findById(code);
        if (!optional.isPresent()) {
            throw new CountryNotFoundException("Cannot update. Country not found with code: " + code);
        }
        Country country = optional.get();
        country.setName(name);
        countryRepository.save(country);
    }
}