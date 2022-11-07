package com.example.repository.dao;

import com.example.model.entity.Location;
import com.example.repository.mybatis.locationMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class LocationDao implements locationMapper {

    public int insertCoordinate(SqlSessionTemplate sqlSession, Location l) {
        return sqlSession.insert("com.example.repository.mybatis.locationMapper.insertCoordinate",l);
    }

    public int selectListCount(SqlSessionTemplate sqlSession, Location l) {
        return sqlSession.selectOne("com.example.repository.mybatis.locationMapper.selectListCount",l);
    }
    public int updateCoordinate(SqlSessionTemplate sqlSession, Location l) {
        return sqlSession.update("com.example.repository.mybatis.locationMapper.updateCoordinate",l);
    }

    public ArrayList<Location> selectMapList(SqlSessionTemplate sqlSession) {
        return (ArrayList)sqlSession.selectList("com.example.repository.mybatis.locationMapper.selectMapList");
    }
}

