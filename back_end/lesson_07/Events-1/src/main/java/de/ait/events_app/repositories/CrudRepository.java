package de.ait.events_app.repositories;

import java.util.List;

public interface CrudRepository<T> {

    void save(T model);
    void deleteById(Long id);
    void update(T model); // TODO переделать на void update(T model);
    T findById(Long id);
    List<T> findAll();

}
