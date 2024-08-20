package com.example.tourism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TourDTO
{
    private Long id;

    private String name;
    private String description;
    private BigDecimal priceAdult;
    private BigDecimal priceChild;
    private Integer duration; // Số ngày
    private BigDecimal discount; // giam gia
    private String startLocation;
    private String endLocation;
    private Boolean availability;
    private String accomodation; // cho o
    private String bestSeason;
    private String meals;
    private String walkingHours;
    private Integer minAge;
    private Integer maxAge;
    private String guideType; // loai huong dan
    private String groupSize;
    private long categoryId;
    private long tripTypeId;
    private long activityId;
    private CostDTO cost;
    private TourOverviewDTO overview;
    private List<TourImageDTO> images;

}
