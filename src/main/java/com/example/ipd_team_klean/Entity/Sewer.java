package com.example.ipd_team_klean.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Sewer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(nullable = false)
    private  double lat;
    @Column(nullable = false)
    private  double lon;
    @Column(nullable = false,name = "States")
    @Setter
    private  String States;
    @Column(nullable = false)
    @Setter
    private  int BlockCount;
    @Column(nullable = false)
    @Setter
    private int Jan_Count;
    @Column(nullable = false)
    @Setter
    private int Feb_Count;
    @Column(nullable = false)
    @Setter
    private int Mar_Count;
    @Column(nullable = false)
    @Setter
    private int Apr_Count;
    @Column(nullable = false)
    @Setter
    private int May_Count;
    @Column(nullable = false)
    @Setter
    private int Jun_Count;
    @Column(nullable = false)
    @Setter
    private int July_Count;
    @Column(nullable = false)
    @Setter
    private int Aug_Count;
    @Column(nullable = false)
    @Setter
    private int Sep_Count;
    @Column(nullable = false)
    @Setter
    private int Oct_Count;
    @Column(nullable = false)
    @Setter
    private int Nov_Count;
    @Column(nullable = false)
    @Setter
    private int Dec_Count;
    @Setter
    private LocalDate BlockDate;
    @Setter
    private LocalTime BlockTime;

    @Setter
    //@Column(nullable = false)
    @Column(nullable = false)
    private String Address_name;

    @Setter
    //@Column(nullable = false)
    @Column(nullable = false)
    private String Region_name;
    @Builder

    public Sewer(Double latitude, Double longitude, String state, int blockCount, int jan, int feb, int mar, int apr, int may, int jun, int july, int aug, int sep, int oct, int nov, int dec, LocalDate blockDate, LocalTime blockTime, String address_name, String region_name) {
        this.lat = latitude;
        lon = longitude;
        States = state;
        BlockCount = blockCount;
        Jan_Count = jan;
        Feb_Count = feb;
        Mar_Count = mar;
        Apr_Count = apr;
        May_Count = may;
        Jun_Count = jun;
        July_Count = july;
        Aug_Count = aug;
        Sep_Count = sep;
        Oct_Count = oct;
        Nov_Count = nov;
        Dec_Count = dec;
        BlockDate = blockDate;
        BlockTime = blockTime;
        Address_name = address_name;
        Region_name = region_name;
    }
}
