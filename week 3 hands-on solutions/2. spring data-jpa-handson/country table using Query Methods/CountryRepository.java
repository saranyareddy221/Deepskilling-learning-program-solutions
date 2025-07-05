package com.cognizant.springlearn.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.springlearn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    // Query to find countries containing a string
    List<Country> findByNameContaining(String keyword);

    // Query to find countries containing a string and order by name
    List<Country> findByNameContainingOrderByNameAsc(String keyword);

    // Query to find countries starting with a specific alphabet
    List<Country> findByNameStartingWith(String alphabet);
}