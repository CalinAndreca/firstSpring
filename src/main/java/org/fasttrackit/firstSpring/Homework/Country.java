package org.fasttrackit.firstSpring.Homework;

import org.springframework.stereotype.Component;

@Component
public class Country {
    private String name;
    private String capital;
    private long population;
    private long area;
    private String continent;
    private String[] neighbors;

    public Country(String name, String capital, long population, long area, String continent, String[] neighbors) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbors = neighbors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String[] getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(String[] neighbors) {
        this.neighbors = neighbors;
    }
}
