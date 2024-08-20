package com.example.tourism.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ActivityImageDTO {
    private Long id;
    private String fileName;
    private String directory;
    private String description;
}
