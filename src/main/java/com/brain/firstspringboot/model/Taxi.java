package com.brain.firstspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import java.time.DayOfWeek;


@Value
@AllArgsConstructor
public class Taxi {
    String car;
    String carNumber;
    String driverName;
    DayOfWeek restDay;
}
