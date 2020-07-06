package com.brain.firstspringboot;

import com.brain.firstspringboot.component.Person;
import com.brain.firstspringboot.service.TaxiCaller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class FirstSpringBootApplication {

    private final TaxiCaller taxiCaller;
    private final Person person;

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootApplication.class, args);
        log.warn("{} Main On {}, {}", "START", 1000, true);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onRun() {
        log.info("приложение запущено");
        taxiCaller.call("Vasia");
        taxiCaller.call("Kolya");
        taxiCaller.call("Olya");
        person.callTaxi();
    }
}
