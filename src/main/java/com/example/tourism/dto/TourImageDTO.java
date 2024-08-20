package com.example.tourism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TourImageDTO {
    private Long id;
    private String fileName;
    private String directory;
    private String description;
}
