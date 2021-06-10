package com.lwl.ms.countryservice.service;
import java.util.List;
import com.lwl.ms.countryservice.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String url = "https://restcountries.eu/rest/v2/";

    @Override
    public List<Country> getCountriesByRegion(String regionName) {
        
        ResponseEntity<List<Country>> responseEntity = restTemplate.exchange(url+"region/"+regionName,HttpMethod.GET,null,new ParameterizedTypeReference<List<Country>>(){});
        List<Country> list = responseEntity.getBody();
        return list;
    }
    
}
