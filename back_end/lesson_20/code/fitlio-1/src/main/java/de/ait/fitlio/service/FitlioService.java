package de.ait.fitlio.service;

import de.ait.fitlio.dto.FitlioDto;
import de.ait.fitlio.dto.NewFitlioDto;

import java.util.List;

public interface FitlioService {

    // добавляем одну тренировку - объект типа FitlioDto
    FitlioDto addFitlio(NewFitlioDto newFitlio);

    // получить список всех тренировок
    List<FitlioDto> getAllFitlio();

    // найти тренировку

    // отредактировать (обновить) тренировку

    // удалить тренировку

}
