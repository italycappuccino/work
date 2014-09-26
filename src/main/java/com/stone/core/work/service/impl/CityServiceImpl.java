package com.stone.core.work.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.stone.core.work.dao.CityDao;
import com.stone.core.work.entity.City;
import com.stone.core.work.service.CityService;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityDao cityDao;

    @Override
    public List<City> listCityByCondition(City city) {
        return this.cityDao.listCityByCondition(city);
    }

    @Override
    public Long countCityByCondition(City city) {
        return this.cityDao.countCityByCondition(city);
    }

}
