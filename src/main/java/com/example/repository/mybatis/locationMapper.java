package com.example.repository.mybatis;

import com.example.model.entity.Location;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Mapper//마이바티스 스프링 모듈에서 자동으로 인식함. 이 구현체를 스프링빈에 등록해줌
public interface locationMapper {
    int insertCoordinate(@Param("sqlSession") SqlSessionTemplate sqlSession, @Param("location") Location l);
    int selectListCount(@Param("sqlSession") SqlSessionTemplate sqlSession, @Param("location")Location l);
    int updateCoordinate(@Param("sqlSession") SqlSessionTemplate sqlSession, @Param("location") Location l);

    ArrayList<Location> selectMapList(SqlSessionTemplate sqlSession);
}
