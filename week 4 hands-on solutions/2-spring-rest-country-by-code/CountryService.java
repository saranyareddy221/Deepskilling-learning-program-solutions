package com.cognizant.springlearn.service;
import com.cognizant.springlearn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class CountryService {
    public Country getCountry(String code) {
        ApplicationContext context = new ClassPathXmlApplicationContext("countryList.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");
        return countries.stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst()
            .orElse(null);
    }
}
