package com.co.bancolombia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class Movie {
    private String name;
    private int durationInMin;
    private Double score;
    private String director;

}
