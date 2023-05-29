package org.fasttrackit.firstSpring.Homework;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CountryReader {
    private final CountryService countryService;

    public CountryReader(CountryService countryService){
        this.countryService = countryService;
        populateCountryService();
    }

    private void populateCountryService(){
        List<Country> countries = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("countries2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                String name = data[0];
                String capital = data[1];
                long population = Long.parseLong(data[2]);
                long area = Long.parseLong(data[3]);
                String continent = data[4];
                String[] neighbors = data[5].split("~");

                Country country = new Country(name, capital, population, area, continent, neighbors);
                countries.add(country);
            }
            countryService.setCountries(countries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
