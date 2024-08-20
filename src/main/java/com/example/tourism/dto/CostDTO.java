package com.example.tourism.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CostDTO {
    private Long id;
    private String includedCost;
    private String excludedCost;
}
