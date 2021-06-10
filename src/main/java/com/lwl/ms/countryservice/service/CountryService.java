package com.lwl.ms.countryservice.service;

import java.util.List;

import com.lwl.ms.countryservice.domain.Country;

public interface CountryService {
   
        public List<Country> getCountriesByRegion(String regionName);
}
