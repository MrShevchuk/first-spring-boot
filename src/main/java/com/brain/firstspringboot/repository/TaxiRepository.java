package com.brain.firstspringboot.repository;

import com.brain.firstspringboot.model.Taxi;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;


@Repository
@RequiredArgsConstructor
@Getter
public class TaxiRepository {
    private final List<Taxi> taxiList;

    public Taxi getFreeTaxi() {
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        return taxiList.stream()
                .filter(t -> !t.equals(today))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Не найдено не одного такси"));

    }
}
