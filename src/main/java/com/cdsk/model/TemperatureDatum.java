package com.cdsk.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemperatureDatum {
    private int x;
    private int y;
    private double temp;
}
