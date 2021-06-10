package com.lwl.ms.countryservice.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {
    private String name;
    private String flag;
    private String capital;
    private long population; 
}
