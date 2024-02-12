package de.ait.fitlio.service.impl;

import de.ait.fitlio.dto.FitlioDto;
import de.ait.fitlio.dto.NewFitlioDto;
import de.ait.fitlio.model.Fitlio;
import de.ait.fitlio.repository.FitlioRepository;
import de.ait.fitlio.service.FitlioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static de.ait.fitlio.dto.FitlioDto.from;


@RequiredArgsConstructor
@Service
public class FitlioServiceImpl implements FitlioService {

    private final FitlioRepository fitlioRepository;

    @Override
    public FitlioDto addFitlio(NewFitlioDto newFitlio) {
        Fitlio fitlio = Fitlio.builder()
                .title(newFitlio.getTitle())
                .description(newFitlio.getDescription())
                .date(LocalDate.parse(newFitlio.getDate()))
                .timeMinute(newFitlio.getTimeMinute())
                .timeHour(newFitlio.getTimeHour())
                .calorie(newFitlio.getCalorie())
                .distance(newFitlio.getDistance())
                .fitType(newFitlio.getFitType())
                .build();

        fitlioRepository.save(fitlio);
        return from(fitlio);
    }

    @Override
    public List<FitlioDto> getAllFitlio() {
        List<Fitlio> fitlioList = fitlioRepository.findAll();
        return from(fitlioList);
    }
}
