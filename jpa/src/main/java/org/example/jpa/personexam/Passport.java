package org.example.jpa.personexam;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "passports")
@NoArgsConstructor
@Getter
@Setter
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "passport_number")
    private String passportNumber;
    @OneToOne
    @JoinColumn(name = "person_id", unique = true) // passports 테이블에 person_id라는 포린키가 존재
    private Person person;

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
