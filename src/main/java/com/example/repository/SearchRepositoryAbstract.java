package com.example.repository;

import com.example.model.entity.SearchEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

abstract public class SearchRepositoryAbstract <Search extends SearchEntity>implements SearchRepository<Search>{

    private final List<Search> searchDb = new ArrayList<>();
    private int index = 0;

    @Override
    public Optional<Search> findById(int index) {
        return searchDb.stream().filter(it -> it.getIndex() == index).findFirst();
    }

    @Override
    public Search save(Search entity) {
        var optionalEntity =searchDb.stream().filter(it -> it.getIndex() == entity.getIndex()).findFirst();

        if(optionalEntity.isEmpty()){
            //db에 이미 데이터 존재
            index++;
            entity.setIndex(index);
            searchDb.add(entity);
            return entity;
        }else {
            //db에 데이터 없음
            var preIndex = optionalEntity.get().getIndex();
            entity.setIndex(preIndex);
            deleteById(preIndex); //기존의 인덱스 삭제 후 새로운 엔티티 추가
            searchDb.add(entity);
            return entity;
        }
    }

    @Override
    public void deleteById(int index) {
        var optionalEntity = searchDb.stream().filter(it -> it.getIndex()==index).findFirst();
        if(optionalEntity.isPresent()){
            searchDb.remove(optionalEntity.get());
        }

    }

    @Override
    public List listAll() {
        return searchDb;
    }
}
