package com.example.tourism.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private long id;
    private String name;
    private String email;
    private String country;
    private String phoneNumber;
    private Integer numberOfAdults;
    private Integer numberOfChildren;
    private long userId;


}
