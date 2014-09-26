package com.stone.core.work.service;

import java.util.List;

import com.stone.core.work.entity.City;

public interface CityService {
    public List<City> listCityByCondition(City city);

    public Long countCityByCondition(City city);
}
