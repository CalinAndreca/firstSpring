package org.fasttrackit.firstSpring.Homework;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {
    private List<Country> countries;

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> listAllCountries() {
        return countries;
    }

    public List<String> listAllCountryNames() {
        return countries.stream().map(Country::getName).collect(Collectors.toList());
    }

    public String getCapital(String countryName) {
        return countries.stream()
                .filter(country -> country.getName().equalsIgnoreCase(countryName))
                .findFirst()
                .map(Country::getCapital)
                .orElse(null);
    }

    public long getPopulation(String countryName) {
        return countries.stream()
                .filter(country -> country.getName().equalsIgnoreCase(countryName))
                .findFirst()
                .map(Country::getPopulation)
                .orElse(0L);
    }

    public List<Country> getCountriesInContinent(String continent) {
        return countries.stream()
                .filter(country -> country.getContinent().equalsIgnoreCase(continent))
                .collect(Collectors.toList());
    }


    public List<Country> getCountriesInContinentWithPopulationLargerThan(String continent, long population) {
        return countries.stream()
                .filter(country -> country.getContinent().equalsIgnoreCase(continent) && country.getPopulation() > population)
                .collect(Collectors.toList());
    }


}
