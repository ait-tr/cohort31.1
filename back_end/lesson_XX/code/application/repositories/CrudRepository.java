package de.ait.application.repositories;

import java.util.List;

public interface CrudRepository <T>{
    void save(T model);
    void updateById(T model);
    void deleteById(Long id);
    T findById(Long id);
    List<T> findAll();
}
