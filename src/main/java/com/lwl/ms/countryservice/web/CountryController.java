package com.lwl.ms.countryservice.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lwl.ms.countryservice.domain.Country;
import com.lwl.ms.countryservice.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/country/")
public class CountryController {
        @Autowired
        public CountryService countryService;

        @GetMapping("/{name}")
        public List<Country> getCountries(@PathVariable("name")String regionName,HttpServletRequest request){
            System.out.println(request.getRequestURI());
            return countryService.getCountriesByRegion(regionName);
        }
}
