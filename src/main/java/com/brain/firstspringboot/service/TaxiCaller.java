package com.brain.firstspringboot.service;

import com.brain.firstspringboot.model.Taxi;
import com.brain.firstspringboot.repository.TaxiRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TaxiCaller {
    private final TaxiRepository taxiRepository;

    public void call(String person) {
        log.info("Call taxi for {}", person);
        Taxi taxi = taxiRepository.getFreeTaxi();
        log.info("Вызвано такси {} для {}", taxi, person);
    }
}
