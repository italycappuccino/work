package com.stone.core.work.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stone.core.work.common.BaseDao;
import com.stone.core.work.dao.CityDao;
import com.stone.core.work.entity.City;

@Repository
public class CityDaoImpl extends BaseDao implements CityDao {

    @SuppressWarnings("unchecked")
    @Override
    public List<City> listCityByCondition(City city) {
        return (List<City>) this.getSqlMapClientTemplate().queryForList("City.listCityByCondition", city);
    }

    @Override
    public Long countCityByCondition(City city) {
        return (Long) this.getSqlMapClientTemplate().queryForObject("City.countCityByCondition", city);
    }

}
