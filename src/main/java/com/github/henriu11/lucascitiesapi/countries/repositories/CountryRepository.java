package com.github.henriu11.lucascitiesapi.countries.repositories;

import com.github.henriu11.lucascitiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {
}
