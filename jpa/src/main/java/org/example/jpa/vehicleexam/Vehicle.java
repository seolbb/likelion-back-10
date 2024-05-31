package org.example.jpa.vehicleexam;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)   // 모든 컬럼을 가진 하나의 테이블을 만들겠다.
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)   // 컬럼명이 type(car/truck) 으로 구분되어 생성된다.
@Getter@Setter
public class Vehicle {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
}

@Entity
@DiscriminatorValue("CAR")
@Getter@Setter
class Car extends Vehicle{
    private int seatCount;
}

@Entity
@DiscriminatorValue("TRUCK")
@Getter@Setter
class Truck extends Vehicle{
    private double payloadCapacity;
}
