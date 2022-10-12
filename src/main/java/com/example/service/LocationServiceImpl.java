package com.example.service;

import com.example.model.entity.Location;
import com.example.repository.dao.LocationDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationDao lDao;

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public int insertCoordinate(Location l) {
        return lDao.insertCoordinate(sqlSession,l);
    }

    @Override
    public int selectListCount(Location l) {
        return lDao.selectListCount(sqlSession, l);
    }

    @Override
    public int updateCoordinate(Location l) {
        return lDao.updateCoordinate(sqlSession,l);
    }

    @Override
    public ArrayList<Location> selectMapList() {
        return lDao.selectMapList(sqlSession);
    }
}
