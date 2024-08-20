package com.example.tourism.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TourImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;  // Tên tệp hình ảnh
    private String directory; // Thư mục chứa hình ảnh
    private String description;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;
}
