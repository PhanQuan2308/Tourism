package com.example.tourism.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private long id;
    private String bookingDate;
    private Integer numberOfAdults;
    private Integer numberOfChildren;
    private BigDecimal totalPrice;
    private String status;
    private long userId;   // quan he nhieu 1 nen can id
    private long addressId;
    private long tourId;


}
