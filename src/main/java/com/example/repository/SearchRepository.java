package com.example.repository;

import java.util.List;
import java.util.Optional;

public interface SearchRepository <Search>{
    Optional<Search> findById(int index);
    Search save(Search entity);
    void deleteById(int index);
    List<Search> listAll();
}
