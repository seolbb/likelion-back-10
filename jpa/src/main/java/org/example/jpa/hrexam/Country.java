package org.example.jpa.hrexam;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "countries")
@Getter
public class Country {
    @Id
    @Column(name = "country_id")
    private String countryId;
    @Column(name = "country_name")
    private String countryName;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

}
