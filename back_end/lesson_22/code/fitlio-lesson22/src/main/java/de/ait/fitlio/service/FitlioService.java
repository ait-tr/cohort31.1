package de.ait.fitlio.service;

import de.ait.fitlio.dto.FitlioDto;
import de.ait.fitlio.dto.NewFitlioDto;
import de.ait.fitlio.model.Fitlio;

import java.util.List;
import java.util.Optional;

public interface FitlioService {
    //добавление одной тренировки - объект типа Fitlio
    FitlioDto addFitlio(NewFitlioDto newFitlio);

    //получить список всех тренировок
    List<FitlioDto> getAllFitlio();

    // найти(получить) тренировку
    FitlioDto getFitlioById(Long fitlioId);


    // изменить тренировку, отредактировать(обновить).


    // удалить тренировку


}
