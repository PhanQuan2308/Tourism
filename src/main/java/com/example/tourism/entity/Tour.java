package com.example.tourism.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String groupSize; // kich thuoc

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    private List<TourImage> images;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private TourCategory category;


    @ManyToOne
    @JoinColumn(name = "trip_type_id")
    private TripType tripType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "activity_id", referencedColumnName = "id")
    private Activity activity;

    @ManyToMany
    @JoinTable(
            name = "tour_transportation",
            joinColumns = @JoinColumn(name = "tour_id"),
            inverseJoinColumns = @JoinColumn(name = "transportation_id")
    )
    private List<Transportation> transportations;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    private List<Booking> bookings;

    @OneToMany(mappedBy = "tour",cascade = CascadeType.ALL)
    private List<Review> reviews;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    private List<FAQ> faqs;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    private List<Itinerary> itineraries;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cost_id", referencedColumnName = "id")
    private Cost cost;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "overview_id", referencedColumnName = "id")
    private TourOverview overview;
}