package de.ait.app1.repositories;

import java.util.List;

public interface CrudRepository<T> {
    void save(T model); // сохраняем, создаем объект
    void deleteById(Long id); // удаляем

    void update(T model);

    T findById(Long id); // читаем один конкретный объект
    List<T> findAll(); // читаем все объекты
}
