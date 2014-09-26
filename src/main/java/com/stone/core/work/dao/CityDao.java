package com.stone.core.work.dao;

import java.util.List;

import com.stone.core.work.entity.City;

public interface CityDao {

    public List<City> listCityByCondition(City city);

    public Long countCityByCondition(City city);

}
