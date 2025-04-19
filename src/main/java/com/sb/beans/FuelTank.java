package com.sb.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FuelTank {
    @Value("${capacity}")
    private int capacity;
    @Value("${fuelType}")
    private String fuelType;

    @Override
    public String toString() {
        return "FuelTank{" +
                "capacity=" + capacity +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
