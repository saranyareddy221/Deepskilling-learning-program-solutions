package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.cognizant.ormlearn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
    List<Country> findByNameContaining(String partialName);
}
