package com.brain.firstspringboot.configuration;

import com.brain.firstspringboot.model.Taxi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class TaxiConfiguration {
    @Bean
    public List<Taxi> taxiList() {
        List<Taxi> list = new ArrayList<>();
        list.add(new Taxi("BMW", "15561", "Zhorik", DayOfWeek.MONDAY));
        list.add(new Taxi("Toyota", "35223", "Rafik", DayOfWeek.FRIDAY));
        list.add(new Taxi("Mazda", "1568568", "Igor", DayOfWeek.WEDNESDAY));
        return list;
    }
}
